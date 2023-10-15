public class ElonsToyCar {
    private int distance;
    private int batteryLevel = 100; // cars start with full (100%) batteries

    public static ElonsToyCar buy() {
        return new ElonsToyCar(); // it returns a brand-new remote controlled car instance
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters"; // it returns the distance as displayed on the LED display
    }

    public String batteryDisplay() {
        if (batteryLevel == 0) {
            return "Battery empty";
        }

        return "Battery at " + batteryLevel + "%"; // it returns the battery percentage as displayed on the LED display
    }

    public void drive() {
        // it does not increase the distance nor decrease the battery percentage when the battery is drained (at 0%)
        if (batteryLevel != 0) {
            distance += 20; // each time one drives the car using the remote control, it covers 20 meters
            batteryLevel--; // each time one drives the car using the remote control, it drains one percent of the battery
        }
    }
}
