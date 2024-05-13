package LeetCode;

import java.util.HashMap;

//return an array of the indexes of the two elements (from input arr) that sum up to target
public class IfTargetIsSumOfTwoArrElements {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> storeIndexesOfElementsFromNumsAsKeysAndTheActualElementsThemselvesAsValues = new HashMap<>();

        int complement = 0;
        for(int i = 0; i < nums.length; i++){
            complement = target - nums[i];

            if (storeIndexesOfElementsFromNumsAsKeysAndTheActualElementsThemselvesAsValues.containsKey(complement)){

                return new int[]{storeIndexesOfElementsFromNumsAsKeysAndTheActualElementsThemselvesAsValues.get(complement),i};
            }
            storeIndexesOfElementsFromNumsAsKeysAndTheActualElementsThemselvesAsValues.put(nums[i], i);
        }


        return new int[0];
    }


}
