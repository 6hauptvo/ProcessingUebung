public class ArrayUebung
{
    public static String rueckwaertsschreiber(String eingabewort)
    {
        eingabewort = eingabewort.strip().toLowerCase();
        char[] buchstabenArray = new char[100];
        for(int i = 1; i <= eingabewort.length(); i++)
        {
            char einBuchstabe = eingabewort.charAt(eingabewort.length()-i);
            buchstabenArray[i-1] = einBuchstabe;
        }
        System.out.println(buchstabenArray);
        return eingabewort;
    }

    public static void pallindromPruefer(String eingabewort)
    {
        eingabewort = eingabewort.strip().toLowerCase();
        String umgekehrtesWort = rueckwaertsschreiber(eingabewort);
        if(umgekehrtesWort.equals(eingabewort))
        {
            System.out.println("Ein Pallindrom.");
        }
        else
        {
            System.out.println("Kein Pallindrom");
        }
    }
}
