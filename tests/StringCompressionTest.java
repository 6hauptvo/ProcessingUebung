import org.junit.Test;

import static org.junit.Assert.*;

public class StringCompressionTest
{

    @Test
    public void stringCompression()
    {
        StringCompression stringCompressionObjekt = new StringCompression();
        assertEquals("4W3B1W2B", stringCompressionObjekt.stringCompression("WWWWBBBWBB"));
        assertEquals("1B5W3B", stringCompressionObjekt.stringCompression("BWWWWWBBB"));
        assertEquals("3W", stringCompressionObjekt.stringCompression("www"));
        assertEquals("2A3B2W", stringCompressionObjekt.stringCompression("aaBBBWW"));
    }
}