public class Lasagna {

    private static final int OVEN_TIME = 40; // according to the cooking book, the expected oven time in minutes is 40
    private static final int LAYER_TIME_PREPARATION = 2; // assuming each layer takes 2 minutes to be prepared

    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return OVEN_TIME;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutesInOven) {
        return this.expectedMinutesInOven() - actualMinutesInOven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * LAYER_TIME_PREPARATION;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberOfLayers, int minutesInOven) {
        return this.preparationTimeInMinutes(numberOfLayers) + minutesInOven;
    }
}
