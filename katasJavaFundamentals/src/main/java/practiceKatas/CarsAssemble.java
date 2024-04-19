package practiceKatas;

/*Instructions

In this exercise you'll be writing code to analyze the production of an assembly line in a car factory. The assembly line's speed can range from 0 (off) to 10 (maximum).

At its lowest speed (1), 221 cars are produced each hour. The production increases linearly with the speed. So with the speed set to 4, it should produce 4 * 221 = 884 cars per hour. However, higher speeds increase the likelihood that faulty cars are produced, which then have to be discarded. The following table shows how speed influences the success rate:

    1 to 4: 100% success rate.
    5 to 8: 90% success rate.
    9: 80% success rate.
    10: 77% success rate.

You have two tasks.
Task1: Implement the CarsAssemble.productionRatePerHour() method to calculate the assembly line's production rate per hour, taking into account its current assembly line's speed :
Task2: Implement the CarsAssemble.workingItemsPerMinute() method to calculate how many working cars are produced per minute:
* */

public class CarsAssemble {

    public double productionRatePerHour(int speed) {

        int maxProductionPerHour = 221;

        // Define successRate
        double successRate = 1.0; // 100% success rate by default

        // Adjust success rate based on speed range
        if (speed >= 5 && speed <= 8) {
            successRate = 0.9; // 90% success rate for speed 5 to 8
        } else if (speed == 9) {
            successRate = 0.8; // 80% success rate for speed 9
        } else if (speed == 10) {
            successRate = 0.77; // 77% success rate for speed 10
        }
        // Calculate production rate per hour considering success rate
        double carsProducedPerHour = speed * maxProductionPerHour * successRate;

        return carsProducedPerHour;



    }

    public int workingItemsPerMinute(int speed) {

        int maxProductionPerHour = 221;


        double successRate = 1.0;


        if (speed >= 5 && speed <= 8) {
            successRate = 0.9;
        } else if (speed == 9) {
            successRate = 0.8;
        } else if (speed == 10) {
            successRate = 0.77;
        }
        // Calculate production rate per hour considering success rate
        double carsProducedPerHour = speed * maxProductionPerHour * successRate;

        //Cast production rates to an int
        int carsProducedPerHoursTruncated = (int) Math.floor(carsProducedPerHour);
        //return carsProduced in one minute
        return carsProducedPerHoursTruncated / 60;

    }
}
