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


        return "www";
    }
}
