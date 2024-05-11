package spartaidg;

import java.util.*;

public class DuplicateLettersFromString {
    public static char[] duplicateLetters(String str) {
        // Create a HashMap to store the frequency of each letter
        Map<Character, Integer> letterFrequency = new HashMap<>();

        // Convert the string to lowercase (if case-insensitive comparison is desired)
        str = str.toLowerCase();

        // Iterate through the string and update the frequency of each letter in the HashMap
        for (char ch : str.toCharArray()) {
            letterFrequency.put(ch, letterFrequency.getOrDefault(ch, 0) + 1);
        }

        // Create a list to store duplicate letters
        List<Character> duplicates = new ArrayList<>();

        // Iterate through the HashMap and add letters with frequency > 1 to the list
        for (Map.Entry<Character, Integer> entry : letterFrequency.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        // Convert the list of duplicates to an array
        char[] duplicatesArray = new char[duplicates.size()];
        for (int i = 0; i < duplicates.size(); i++) {
            duplicatesArray[i] = duplicates.get(i);
        }

        // Return the array of duplicate letters
        return duplicatesArray;
    }

    public static void main(String[] args) {
        // Test case
        String str = "Hello World!";
        char[] duplicates = duplicateLetters(str);

        // Print the array of duplicate letters
        System.out.println("Duplicate letters in the string: " + Arrays.toString(duplicates));
    }
}