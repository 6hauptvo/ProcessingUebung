/**
 * Der BarcodeGenerator generiert aus einer 11-stelligen Ziffernfolge einen in 0en, 1en und 2en kodierten, gültigen
 * UPC-A-Barcode.
 */
public class BarcodeGenerator
{
    private final String _ZIFFERNFOLGE;

    public BarcodeGenerator(String Ziffernfolge)
    {
        _ZIFFERNFOLGE = Ziffernfolge;
    }

    /**
     * Die Methode erzeugt einen String bestehend aus 0en für weiß, 1en für kurz schwarz und 2en für lang schwarz,
     * welcher die vollständige Abfolge der Balken des UPC-A-Barcodes ausgibt.
     * @return String aus 0en, 1en und 2en
     */

    public String barcodeGenerator()
    {
        String barcode = "";
        if(pruefeAufGueltigeZiffernfolge())
        {
            String start = "0000000202";
            String ende = "2020000000";
            String mitte = "02020";
            String muster = musterGenerator();
            String ersterTeil = muster.substring(0, 42);
            String zweiterTeil = muster.substring(42);
            String pruefziffer = pruefsummenMusterGenerator();
            barcode = start + ersterTeil + mitte + zweiterTeil + pruefziffer + ende;
        }
        else
        {
            System.out.println("Keine gültige Ziffer. Die Eingabe muss eine 11-stellige Zahl sein");
        }
        return barcode;
    }

    /**
     * Die Methode berechnet die Prüfsumme und kodiert sie in ein Muster aus 0en, 1en und 2en.
     * @return String ein Muster aus 0en, 1en und 2en für die Prüfsumme
     */
    public String pruefsummenMusterGenerator()
    {
        int zwischenergebnis = 0;
        int summeEins = 0;
        int summeZwei = 0;
        String muster = "";
        for(int i = 1; i < _ZIFFERNFOLGE.length(); i+=2)
        {
            char ziffer = _ZIFFERNFOLGE.charAt(i);
            int zahl = Character.getNumericValue(ziffer);
            summeEins = summeEins + zahl;
        }
        zwischenergebnis = summeEins*3;
        for(int i = 0; i < _ZIFFERNFOLGE.length(); i+=2)
        {
            char ziffer = _ZIFFERNFOLGE.charAt(i);
            int zahl = Character.getNumericValue(ziffer);
            summeZwei = summeZwei + zahl;
        }
        zwischenergebnis = (summeEins + summeZwei)%10;
        if(zwischenergebnis>0)
        {
            zwischenergebnis = 10 - zwischenergebnis;
        }
        muster = stringInMusterUmwandler(zwischenergebnis+"");
        muster = stringMusterKonvertierer(muster);
        return muster;
    }

    public String musterGenerator()
    {
        String konvertierterZweiterTeil = "";
        String muster = "";
        String vormuster = stringInMusterUmwandler(_ZIFFERNFOLGE);
        String ersterTeil = vormuster.substring(0, 42);
        String zweiterTeil = vormuster.substring(42);
        konvertierterZweiterTeil = stringMusterKonvertierer(zweiterTeil);
        muster = ersterTeil + konvertierterZweiterTeil;
        return muster;
    }

    public String stringInMusterUmwandler(String eingabeString)
    {
        String vormuster = "";
        for(int i = 0; i < eingabeString.length(); i++) {
            char ziffer = eingabeString.charAt(i);
            int zahl = Character.getNumericValue(ziffer);
            String unterstring = "";
            if (zahl < 3) {
                if (zahl == 0) {
                    unterstring = "0001101";
                } else if (zahl == 2) {
                    unterstring = "0010011";
                } else if (zahl == 1) {
                    unterstring = "0011001";
                }
            } else if (zahl < 6 && zahl > 2) {
                if (zahl == 3) {
                    unterstring = "0111101";
                } else if (zahl == 5) {
                    unterstring = "0110001";
                } else if (zahl == 4) {
                    unterstring = "0100011";
                }
            } else if (zahl < 9 && zahl > 5) {
                if (zahl == 6) {
                    unterstring = "0101111";
                } else if (zahl == 8) {
                    unterstring = "0110111";
                } else if (zahl == 7) {
                    unterstring = "0111011";
                }
            } else if (zahl == 9) {
                unterstring = "0001011";
            }
            vormuster = vormuster + unterstring;
        }
        return vormuster;
    }

    public String stringMusterKonvertierer(String eingabeString)
    {
        String konvertierterTeil = "";
        for(int i = 0; i < eingabeString.length(); i++)
        {
            char ziffer = eingabeString.charAt(i);
            int zahl = Character.getNumericValue(ziffer);
            if(zahl == 0)
            {
                konvertierterTeil = konvertierterTeil + "1";
            }
            else if(zahl == 1)
            {
                konvertierterTeil = konvertierterTeil + "0";
            }
        }
        return konvertierterTeil;
    }

    public Boolean pruefeAufGueltigeZiffernfolge()
    {
        int counter = 0;
        Boolean korrekt = false;
        Boolean buchstabe = false;
        for(int i = 0; i < _ZIFFERNFOLGE.length(); i++)
        {
            char ziffer = _ZIFFERNFOLGE.charAt(i);
            if(Character.isDigit(ziffer))
            {
                counter++;
            }
            else
            {
                buchstabe = true;
            }
        }
        if(counter == 11 && !buchstabe)
        {
            korrekt = true;
        }
        return korrekt;
    }
}