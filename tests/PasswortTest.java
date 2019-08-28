import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PasswortTest
{
    private char[] pwd_first = "PassWD!!".toCharArray();
    private char[] pwd_weak = "1234567890".toCharArray();
    private char[] pwd_strong = "NewPWD16!!".toCharArray();
    private char[] pwd_help = "PassWD!!".toCharArray();
    private Passwort pwd = new Passwort(pwd_first);

    @Test
    public void changePassword()
    {
        assertFalse(pwd.changePassword(pwd_first, pwd_weak));
        assertFalse(pwd.changePassword(pwd_first, pwd_strong));
        assertTrue(pwd.changePassword(pwd_first, pwd_strong));
        pwd_first[0] = 'P';
        assertArrayEquals(pwd_first, pwd_help);
        System.out.println(pwd.changePassword(pwd_first, pwd_weak));
        System.out.println(pwd.changePassword(pwd_first, pwd_strong));
        System.out.println(pwd_first[0] = 'P');
        System.out.println(pwd.changePassword(pwd_first, pwd_strong));
    }

    @Test
    public void deletePassword()
    {

    }
}