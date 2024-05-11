package practicekatas_exercism;


/*
*In this exercise you'll be playing around with a remote controlled car, which you've finally saved enough money for to buy.

Cars start with full (100%) batteries. Each time you drive the car using the remote control, it covers 20 meters and drains one percent of the battery.

The remote controlled car has a fancy LED display that shows two bits of information:

    The total distance it has driven, displayed as: "Driven <METERS> meters".
    The remaining battery charge, displayed as: "Battery at <PERCENTAGE>%".

If the battery is at 0%, you can't drive the car anymore and the battery display will show "Battery empty".

You have six tasks, each of which will work with remote controlled car instances.

* Task 1: Implement the (static) ElonsToyCar.buy() method to return a brand-new remote controlled car instance:
* Task 2: Implement the ElonsToyCar.distanceDisplay() method to return the distance as displayed on the LED display:
* Task 3: Implement the ElonsToyCar.batteryDisplay() method to return the battery percentage as displayed on the LED display:
* Task 4: Implement the ElonsToyCar.drive() method that updates the number of meters driven:
* Task 5: Update the ElonsToyCar.drive() method to update the battery percentage:
* Task 6:Update the ElonsToyCar.drive() method to not increase the distance driven nor decrease the battery percentage when the battery is drained (at 0%):
*
*
*
*
*
*
* */

public class ElonsToyCar {

    private int totalDistance = 0;
    private int batteryCharge = 100;

    public static ElonsToyCar buy() {
        ElonsToyCar myToyCar = new ElonsToyCar();
        myToyCar.totalDistance = 0;
        myToyCar.batteryCharge = 100;
        return myToyCar;
    }

    public String distanceDisplay() {

        return "Driven " + totalDistance +
                " meters";

    }

    public String batteryDisplay() {
        if(batteryCharge == 0) {
            return "Battery empty";
        } else {
            return "Battery at " +batteryCharge+"%";
        }


    }

    public void drive() {

        if (batteryCharge > 0) {
            totalDistance += 20;
            batteryCharge--;
        }

    }
}

