package codingBat;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Plus1MultipledBy10.MathOperations mathOperations = new Plus1MultipledBy10.MathOperations();

        // Test the method
        ArrayList<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        ArrayList<Integer> result = mathOperations.math1(nums);
        System.out.println(result);  // Output: [20, 30, 40, 50, 60]
    }
}
