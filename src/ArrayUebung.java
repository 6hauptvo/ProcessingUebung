public class ArrayUebung
{
    public static String rueckwaertsschreiber(String eingabewort)
    {
        String wort = eingabewort.strip().toLowerCase();
        char[] buchstabenArray = new char[100];
        for(int i = 1; i <= wort.length(); i++)
        {
            char einBuchstabe = wort.charAt(wort.length()-i);
            buchstabenArray[i-1] = einBuchstabe;
        }
        System.out.println(buchstabenArray);
        return wort;
    }

    public static void pallindromPruefer(String eingabewort)
    {
        String wort = eingabewort.strip().toLowerCase();
        String umgekehrtesWort = rueckwaertsschreiber(wort);
        if(umgekehrtesWort.equals(wort))
        {
            System.out.println("Ein Pallindrom.");
        }
        else
        {
            System.out.println("Kein Pallindrom");
        }
    }
}
