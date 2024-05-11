package codingBat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Doubling {


//Given a list of integers, return a list where each integer is multiplied by 2.
    public List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }

 //Given an arr of integers, return an arr where each integer is multiplied by 2.

    public static int[] multiplyByTwo(int[] arr) {
        return Arrays.stream(arr)
                .map(num -> num * 2)
                .toArray();
    }





}

