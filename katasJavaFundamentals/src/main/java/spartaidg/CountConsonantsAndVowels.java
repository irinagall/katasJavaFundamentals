package spartaidg;

public class CountConsonantsAndVowels {
    public static int[] countConsonantsAndVowels(String str) {
        int[]counts = new int[2];
        // Convert the string to lowercase for case-insensitive counting
        str = str.toLowerCase();

        // Initialize counters for consonants and vowels
        //int consonantCount = 0;
        //int vowelCount = 0;

        // Iterate through the characters of the string
        for (char ch : str.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    counts[1]++;
                } else {
                    counts[0]++;
                }
            }
        }

        // Create and return the result array
        return counts;
    }
}
