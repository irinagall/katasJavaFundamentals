package spartaidg;

public class CountOfOddsAndEvens {

    int[] countsOfOddAndEven = new int[2];

    public int[] getCountsOfOddAndEven(int[]nums) {
        // Iterate through the nums array
        for (int num : nums) {
            // Check if the current number is even
            if (num % 2 == 0) {
                // If even, increment the count of even numbers at index 0
                countsOfOddAndEven[0]++;
            } else {
                // If odd, increment the count of odd numbers at index 1
                countsOfOddAndEven[1]++;
            }
        }
        return countsOfOddAndEven;
    }
}
