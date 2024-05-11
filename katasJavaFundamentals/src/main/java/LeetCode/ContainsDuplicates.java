package LeetCode;

import java.util.HashSet;

public class ContainsDuplicates {


        public boolean containsDuplicate(int[] nums) {

            // Create a HashSet to store unique elements
            HashSet<Integer> set = new HashSet<>();

            // Iterate through the array
            for (int num : nums) {
                // If the HashSet already contains the current element, it's a duplicate
                if (set.contains(num)) {
                    return true;
                }
                // Otherwise, add the element to the HashSet
                set.add(num);
            }

            // If we finish iterating without finding duplicates, return false
            return false;



        }

}
