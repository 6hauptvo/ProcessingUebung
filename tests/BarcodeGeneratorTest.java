import org.junit.Test;

import static org.junit.Assert.*;

public class BarcodeGeneratorTest
{
    BarcodeGenerator barcodeGeneratorObjekt = new BarcodeGenerator("01234567890"); //"01234567890"
    BarcodeGenerator barcodeGeneratorObjekt2 = new BarcodeGenerator("98765432110"); //"98765432110"


    @Test
    public void musterGenerator()
    {
        assertEquals("00011010011001001001101111010100011011000110100001000100100100011101001110010",
               barcodeGeneratorObjekt.musterGenerator());
    }

    @Test
    public void pruefsummenMusterGenerator()
    {
        assertEquals("1011100", barcodeGeneratorObjekt2.pruefsummenMusterGenerator());
        assertEquals("1001110", barcodeGeneratorObjekt.pruefsummenMusterGenerator());
    }

    @Test
    public void barcodeGenerator()
    {
        assertEquals("0000000202000110100110010010011011110101000110110001020201010000100010010010001110100111001010011102020000000",
                barcodeGeneratorObjekt.barcodeGenerator());
    }
}