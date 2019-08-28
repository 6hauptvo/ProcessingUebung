public class Passwort
{
    public Passwort(char[] passwort)
    {

    }

    public Boolean changePassword(String altesPasswort, String neuesPasswort)
    {
        return false;
    }

    public void deletePassword(String password)
    {

    }

    char[] makePasswordUnreadable(char[] password)
    {
        for(int i = 0; i < password.length; i++)
        {
            password[i] = ' ';
        }
        return password;
    }
}
