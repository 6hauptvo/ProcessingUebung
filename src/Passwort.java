public class Passwort
{
    private char[] _passwort;

    public Passwort(char[] passwort)
    {
        _passwort = passwort;
    }

    public Boolean changePassword(char[] altesPasswort, char[] neuesPasswort)
    {
        Boolean change = false;
        if(_passwort == altesPasswort)
        {
            StarkesPasswortPruefer pruefer = new StarkesPasswortPruefer();
            String npw = String.valueOf(neuesPasswort);
            String apw = String.valueOf(altesPasswort);
            if(pruefer.passwortpruefer(npw) && pruefer.passwortpruefer(apw))
            {
                _passwort = neuesPasswort;
                change = true;
            }
        }
        return change;
    }

    public void deletePassword(char[] password)
    {

    }
}
