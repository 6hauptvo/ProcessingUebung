import org.junit.Test;
import static org.junit.Assert.*;

public class StringToStringArrayUebungTest
{
    StringToStringArrayUebung stringToStringArrayObject = new StringToStringArrayUebung();

    @Test
    public void toStringArrayTest()
        {
            String[] stringArray = stringToStringArrayObject.toStringArray("['Null', 'Ei,ns', 'Zwei', 'Drei', 'Vier']");
            String[] stringArray2 = stringToStringArrayObject.toStringArray("[ Null Eins Zwei Drei");
            String arrayToString = "";
            for(String arrayEintrag : stringArray)
            {
                if(arrayEintrag != null)
                {
                    arrayEintrag.strip();
                    arrayToString += arrayEintrag + " ";
                }
            }
            assertEquals("-Null -Ei,ns -Zwei -Drei -Vier", arrayToString.strip());
            assertEquals("-Null", stringArray[0]);
            assertEquals("-Ei,ns", stringArray[1]);
            assertEquals("-Vier", stringArray[4]);
            //assertEquals("", stringArray2);
        }
}