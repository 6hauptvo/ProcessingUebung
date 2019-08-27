/**
 * Diese Klasse gibt einen String von Buchstaben als komprimierten String in der Form Anzahl eines Buchstaben Buchstabe zurück.
 */
public class StringCompression {
    public String stringCompression(String string) {
        int counter = 1;
        String result = "";

        string = string.trim().toUpperCase();
        char previousChar = string.charAt(0);

        for (int i = 1; i < string.length(); i++) {
            char character = string.charAt(i);
            if (character != previousChar && (character == 'W' || character == 'B')) {
                result = result + counter + previousChar;
                counter = 1;
                previousChar = character;
            } else if (character == previousChar) {
                counter++;
            }
        }

        if (counter != 1) {
            result = result + counter + previousChar;
        }

        if (counter == 1 && previousChar == 'B') {
            result = result + "1B";
        }

        if (counter == 1 && previousChar == 'W') {
            result = result + "1W";
        }
        return result;
    }
}