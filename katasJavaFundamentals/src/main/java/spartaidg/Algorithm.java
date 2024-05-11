package spartaidg;
//Implement the method Algorithm.findLowest(int[] numbers) so it returns the lowest numbers in the numbers array
//If the numbers array is empty or null, the method should throw an IllegalArgumentException

public class Algorithm {
    public static int findLowest(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int lowest = numbers[0]; // Initialize with the first element of the array

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }

        return lowest;
    }
}