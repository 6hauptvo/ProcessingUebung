import org.junit.Test;

import static org.junit.Assert.*;

public class SongtextsucheTest
{
    Songtextsuche songtextsucheObjekt = new Songtextsuche("Fler", "Unterwegs");
    Songtextsuche songtextsucheObjekt2 = new Songtextsuche("Capital Bra", "Sollte so sein");

    @Test
    public void Songtextsuche()
    {
        assertEquals("http://lyrics.wikia.com/api.php?func=getSong&artist=fler&song=unterwegs",
                songtextsucheObjekt.getURL());
        assertEquals("http://lyrics.wikia.com/api.php?func=getSong&artist=capital_bra&song=sollte_so_sein",
                songtextsucheObjekt2.getURL());
    }
}