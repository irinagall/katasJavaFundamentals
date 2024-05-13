package LeetCode;

import java.util.HashSet;

public class ContainsDuplicates {


        public boolean containsDuplicate(int[] nums) {

            // Create a HashSet to store unique elements
            HashSet<Integer> setToStoreDistinctNums = new HashSet<>();

            // Iterate through the array
            for (int integerInNums : nums) {
                // If the HashSet already contains the current element, it's a duplicate
                if (setToStoreDistinctNums.contains(integerInNums)) {
                    return true;
                }
                // Otherwise, add the element to the HashSet
                setToStoreDistinctNums.add(integerInNums);
            }


            // If we finish iterating without finding duplicates, return false
            return false;




        }


}
