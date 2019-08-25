public class Split
{
    public String[] split(String input)
    {
        input = input.strip().toLowerCase();
        if(input.charAt(input.length()-1) != ';')
        {
            input = input + ";";
        }

        String[] resultArray = new String[100];
        int arrayIndex = 0;
        int firstIndex = 0;

        for(int i = 0; i < input.length(); i++)
        {
            char currentChar = input.charAt(i);

            if(currentChar == ';')
            {
                String substring = input.substring(firstIndex, i);
                firstIndex = i + 1;
                resultArray[arrayIndex] = substring;
                arrayIndex++;
            }
        }
        return resultArray;
    }
}
