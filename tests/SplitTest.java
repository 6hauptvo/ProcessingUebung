import org.junit.Test;

import static org.junit.Assert.*;

public class SplitTest
{
    @Test
    public void splitTest()
    {
        Split splitObjekt = new Split();
        String[] ergebnisArray = splitObjekt.split("ab;cde;fghi;jklm");
        assertEquals("ab", ergebnisArray[0]);
        assertEquals("cde", ergebnisArray[1]);
        assertEquals("fghi", ergebnisArray[2]);
        assertEquals("jklm", ergebnisArray[3]);
    }

}