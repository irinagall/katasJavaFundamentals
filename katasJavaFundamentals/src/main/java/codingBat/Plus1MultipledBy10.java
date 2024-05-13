package codingBat;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
// Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.

public class Plus1MultipledBy10 {
    public static class MathOperations {
        public ArrayList<Integer> math1(ArrayList<Integer> nums) {
            return new ArrayList<>(nums.stream()
                    .map(n -> (n + 1) * 10)
                    .collect(Collectors.toList()));
        }
    }
}
