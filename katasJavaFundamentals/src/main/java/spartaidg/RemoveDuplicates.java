package spartaidg;

import java.util.Arrays;

public class RemoveDuplicates {

    public static String[] removeDuplicates(String[] data) {
        /*if (strings == null) {
            return null;
        }*/

        return Arrays.stream(data)
                .distinct() // Remove duplicates
                .toArray(String[]::new); // Convert stream to array
    }
};
