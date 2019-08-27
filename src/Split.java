public class Split
{
    public String[] split(String input)
    {
        String word = input.strip().toLowerCase();
        if(word.charAt(word.length()-1) != ';')
        {
            word = word + ";";
        }

        String[] resultArray = new String[100];
        int arrayIndex = 0;
        int firstIndex = 0;

        for(int i = 0; i < word.length(); i++)
        {
            char currentChar = word.charAt(i);

            if(currentChar == ';')
            {
                String substring = word.substring(firstIndex, i);
                firstIndex = i + 1;
                resultArray[arrayIndex] = substring;
                arrayIndex++;
            }
        }
        return resultArray;
    }
}
