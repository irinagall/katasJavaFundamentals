package practicekatas_exercism;

public class Raindrops {

    String convert(int number) {

        String output = "";

        if (number % 3 == 0) {
            output += "Pling";
        }
        if (number % 5 == 0) {
            output += "Plang";
        }
        if (number % 7 == 0) {
            output += "Plong";
        }

        // Check if no factors of 3, 5, or 7 were found
        if (output.isEmpty()) {
            //return Integer.toString(number);
            return number + "";
        }

        return output;
    }


}
