/**
 * Diese Klasse prüft, ob es sich um ein starkes Passwort handelt.
 */
public class StarkesPasswortPruefer
{
    /**
     * Diese Methode prüft ob min. 8 Zeichen, min. 1 Kleinbuchstabe, min. 1 Großbuchstabe, min. eine Ziffer und min.
     * 1 Sonderzeichen vorhanden sind.
     */
    public Boolean passwortpruefer(String passwort)
    {
        passwort = passwort.strip();

        Boolean sonderzeichen = false;
        Boolean mindeslaenge = false;
        Boolean kleinbuchstabe = false;
        Boolean grossbuchstabe = false;
        Boolean ziffer = false;

        if (passwort.length() > 7 && (passwort.contains("*") || passwort.contains("!"))) {
            mindeslaenge = true;
            sonderzeichen = true;

            for (int i = 0; i < passwort.length(); i++) {
                char aktuellerBuchstabe = passwort.charAt(i);
                String aktuellerBuchstabeAlsString = "" + aktuellerBuchstabe;

                for (int j = 0; j < 10; j++) {
                    if (aktuellerBuchstabeAlsString.contains("" + j)) {
                        ziffer = true;
                    } else {
                        if (aktuellerBuchstabeAlsString.equals(aktuellerBuchstabeAlsString.toUpperCase())) {
                            grossbuchstabe = true;
                        } else {
                            kleinbuchstabe = true;
                        }
                    }
                }
            }

        }
        return grossbuchstabe && kleinbuchstabe && sonderzeichen && mindeslaenge && ziffer;
    }
}
