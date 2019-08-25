import org.junit.Test;
import static org.junit.Assert.*;

public class StringToStringArrayUebungTest
{
    StringToStringArrayUebung stringToStringArrayObject = new StringToStringArrayUebung();

    @Test
    public void toStringArrayTest()
        {
            String[] stringArray = stringToStringArrayObject.toStringArray("['Null', 'Ei,ns', 'Zwei', 'Drei', 'Vier']");
            //assertEquals("-Null -Ei,ns -Zwei -Drei -Vier", stringArray);
            assertEquals("-Null", stringArray[0]);
            assertEquals("-Ei,ns", stringArray[1]);
            assertEquals("-Vier", stringArray[4]);
        }
}