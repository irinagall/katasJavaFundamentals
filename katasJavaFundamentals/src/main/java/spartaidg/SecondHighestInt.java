package spartaidg;

import java.util.Arrays;

public class SecondHighestInt {

    public static int secondHighestNumber(int[] intsArr){

        if (intsArr == null || intsArr.length < 2) {
            throw new IllegalArgumentException("Input array does not contain at least two elements");
        }

        Arrays.sort(intsArr);
        for(int i= intsArr.length -2 ; i>=0; i--) {
            if (intsArr[i] < intsArr[intsArr.length - 1]) {
                return intsArr[i];
            }
        }
    return intsArr[intsArr.length - 1];
    }


    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 3, 7, 2, 9};
        int[] arr2 = {-5, -2, -10, -3, -7};
        int[] arr3 = {1, 1, 1, 1, 1};

        System.out.println("Second highest number in arr1: " + secondHighestNumber(arr1)); // Output: 7
        System.out.println("Second highest number in arr2: " + secondHighestNumber(arr2)); // Output: -3
        System.out.println("Second highest number in arr3: " + secondHighestNumber(arr3)); // Output: 1
    }

}

