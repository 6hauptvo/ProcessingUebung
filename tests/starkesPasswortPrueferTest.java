import org.junit.Test;

import static org.junit.Assert.*;

public class starkesPasswortPrueferTest
{
    @Test
    public void passwortprueferTest()
    {
        StarkesPasswortPruefer starkesPasswortPrueferObjekt = new StarkesPasswortPruefer();
        assertTrue(starkesPasswortPrueferObjekt.passwortpruefer("eVJo2!8IrRo"));
        assertTrue(starkesPasswortPrueferObjekt.passwortpruefer("aH6*LauTp21u"));
        assertTrue(starkesPasswortPrueferObjekt.passwortpruefer("S3cr3ts!"));
        assertFalse(starkesPasswortPrueferObjekt.passwortpruefer("Passwort123"));
        assertFalse(starkesPasswortPrueferObjekt.passwortpruefer("!2Bcv"));
        assertFalse(starkesPasswortPrueferObjekt.passwortpruefer("123456"));
        }
    }