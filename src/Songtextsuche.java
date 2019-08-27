/**
 * Erzeugt eine URL für die Suche von Songtexten in lyrics.wikia.com
 */
public class Songtextsuche
{
    String _songtext;
    String _interpret;
    public Songtextsuche(String interpret, String songtext)
    {
        _interpret = interpret;
        _songtext = songtext;
    }

    public String getURL()
    {
        String url = "http://lyrics.wikia.com/api.php?func=getSong&artist=&song=";
        String vorSong = url.substring(0, 52);
        String nachSong = url.substring(52);

        _songtext = _songtext.strip().toLowerCase();
        _interpret = _interpret.strip().toLowerCase();
        _songtext = stringUmwandler(_songtext);
        _interpret = stringUmwandler(_interpret);

        url = vorSong + _interpret + nachSong + _songtext;
        return url;
    }

    public String stringUmwandler(String eingabeWort)
    {
        for(int i = 0; i < eingabeWort.length(); i++)
        {
            if(eingabeWort.charAt(i) == ' ')
            {
                String ersterTeil = eingabeWort.substring(0, i);
                String zweiterTeil = eingabeWort.substring(i);
                eingabeWort = ersterTeil + "_" + zweiterTeil;
                System.out.println(eingabeWort);
            }
        }
        return eingabeWort;
    }
}
