public class ElonsToyCar {
    private int meters;
    private int percentage = 100; // cars start with full (100%) batteries
    public static ElonsToyCar buy() {
        return new ElonsToyCar(); // it returns a brand-new remote controlled car instance
    }

    public String distanceDisplay() {
        return "Driven " + meters + " meters"; // it returns the distance as displayed on the LED display
    }

    public String batteryDisplay() {
        if (percentage == 0) {
            return "Battery empty";
        }

        return "Battery at " + percentage + "%"; // it returns the battery percentage as displayed on the LED display
    }

    public void drive() {
        // it does not increase the distance nor decrease the battery percentage when the battery is drained (at 0%)
        if (percentage == 0) {
            return;
        }

        // it updates the number of meters driven
        meters = meters + 20; // each time one drives the car using the remote control, it covers 20 meters

        // it updates the battery percentage
        percentage--; // each time one drives the car using the remote control, it drains one percent of the battery
    }
}
