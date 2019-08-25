public class StringToStringArrayUebung
{
    public String[] toStringArray(String jsonString)
    {
        jsonString = jsonString.strip();
        String[] stringArray = new String[100];

        for(int i = 0; i < jsonString.length(); i++)
        {
            int firstPos = 0;
            int secondPos = 0;
            int counter = 0;

            if(jsonString.charAt(i) == '\'' && firstPos != 0)
            {
                String substring = jsonString.substring(firstPos+1, secondPos);
                stringArray[counter] = "-"+substring;
                firstPos = 0;
                secondPos = 0;
                counter++;
            }
            else if(jsonString.charAt(i) == '\'' && firstPos == 0)
            {
                firstPos = i;
            }
        }
        return stringArray;
    }
}
