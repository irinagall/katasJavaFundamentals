package spartaidg;

/*Find the first instance of the word Sparta in the string and return an int of its string location or
zero if the word Sparta does not exist in the string.*/

public class FindSparta {
    public static int findSparta(String str) {
        if (str == null) {
            return 0; // Return 0 if input string is null
        }

        // Split the input string by spaces
        String[] words = str.split(" ");

        // Iterate through the array to find the index of "Sparta"
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase("sparta")) {
                return i + 1; // Return the 1-based index of "Sparta"
            }
        }

        // Return 0 if "Sparta" is not found
        return 0;
    }

    public static void main(String[] args) {
        // Test cases
        String[] testStrings = {
                "Sparta is a great city",
                "The battle of Sparta",
                "Ancient city of Sparta",
                "We are going to sparta",
                "Visit SpArTa soon",
                "Sparta, sparta, spArTa!",
                null,
                "This is a test",
                "No Sparta here",
                "The Spartacus"
        };

        // Test each string and print the result
        for (String testString : testStrings) {
            int result = findSparta(testString);
            System.out.println("String: " + (testString != null ? testString : "null") + " | Result: " + result);
        }
    }
}
