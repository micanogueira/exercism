class NeedForSpeed {
    private int distanceDriven;
    private int batteryLevel = 100;
    private int speed;
    private int batteryDrain;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return batteryLevel == 0;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()) {
            this.distanceDriven += speed; // updates the number of meters driven based on the car's speed
            this.batteryLevel -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        boolean finish = false;

        while (!car.batteryDrained()) {
            car.drive();
            if (car.distanceDriven() == distance) {
                finish = true;
                break;
            }
        }

        return finish;
    }
}
