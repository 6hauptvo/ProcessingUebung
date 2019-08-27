public class StringToStringArrayUebung
{
    //TODO fix this method, Nullpointer abfangen

    public String[] toStringArray(String eingabestring)
    {
        String jsonString = eingabestring.strip();
        String[] stringArray = new String[100];

        if(formPruefer(jsonString))
        {
            int firstPos = 0;
            int secondPos = 0;
            int counter = 0;

            for(int i = 0; i < jsonString.length(); i++)
            {
                if(jsonString.charAt(i) == '\'' && firstPos != 0)
                {
                    secondPos = i;
                    String substring = jsonString.substring(firstPos+1, secondPos);
                    stringArray[counter] = "-" + substring;
                    firstPos = 0;
                    counter++;
                }
                else if(jsonString.charAt(i) == '\'' && firstPos == 0)
                {
                    firstPos = i;
                }
            }
        }
        return stringArray;
    }

    public Boolean formPruefer(String jsonString)
    {
        Boolean korrekteForm = true;
        jsonString = jsonString.strip();
        String erstesZeichen = jsonString.substring(0, 1);
        String zweitesZeichen = jsonString.substring(jsonString.length()-1);
        String restString = jsonString.substring(1, jsonString.length()-1);

        if(!erstesZeichen.equals("[") || !zweitesZeichen.equals("]"))
        {
            korrekteForm = false;
        }

        else
        {
            int zaehler = 0;
            for(int i = 0; i < restString.length(); i++)
            {
                char aktuellesZeichen = restString.charAt(i);
                if(aktuellesZeichen == '\'')
                {
                    zaehler++;
                }
                else if(aktuellesZeichen == '[' || aktuellesZeichen == ']')
                {
                    korrekteForm = false;
                }
            }
            if(zaehler % 2 == 1 || zaehler < 2)
            {
                korrekteForm = false;
            }
        }
        return korrekteForm;
    }
}
