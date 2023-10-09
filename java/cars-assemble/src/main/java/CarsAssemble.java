public class CarsAssemble {

    private static final int CARS_PRODUCED_PER_HOUR = 221;
    private static final int MIN_SPEED = 1;
    private static final int MAX_SPEED = 10;

    public double productionRatePerHour(int speed) {
        if (speed < MIN_SPEED || speed > MAX_SPEED) {
            return 0;
        }

        if (speed <= 4) {
            return speed * CARS_PRODUCED_PER_HOUR; // 1 to 4: 100% success rate
        } else if (speed <= 8) {
            return speed * CARS_PRODUCED_PER_HOUR * 0.9; // 5 to 8: 90% success rate
        } else if (speed == 9) {
            return speed * CARS_PRODUCED_PER_HOUR * 0.8; // 9: 80% success rate
        } else {
            return speed * CARS_PRODUCED_PER_HOUR * 0.77; // 10: 77% success rate;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (this.productionRatePerHour(speed) / 60);
    }
}
