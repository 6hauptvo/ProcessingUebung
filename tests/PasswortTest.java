import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PasswortTest
{
    String string = "123tEDEqw1*";
    String string2 = "ksjekJSSJ*34";
    String string3 = "1234";
    Passwort passwort = new Passwort(string.toCharArray());
    Passwort passwort2 = new Passwort(string2.toCharArray());
    Passwort passwort3 = new Passwort(string3.toCharArray());
    char[] charArray = new char[]{' ',' ',' ',' '};
    @Test
    public void changePassword()
    {
        assertTrue(passwort.changePassword("123tEDEqw1*", "dadfDE234Ht!"));
        assertFalse(passwort2.changePassword("ksjekJSSJ*34", "123kjkjdks"));
        assertFalse(passwort.changePassword("123tEdEqw1*", "ksjekJSSJ*34"));
    }

    @Test
    public void deletePassword()
    {

    }

    @Test
    public void makePasswordUnreadable()
    {
        assertFalse(Arrays.equals(charArray,passwort3.makePasswordUnreadable(string2.toCharArray())));
        assertArrayEquals(charArray, passwort2.makePasswordUnreadable(string2.toCharArray()));
    }
}