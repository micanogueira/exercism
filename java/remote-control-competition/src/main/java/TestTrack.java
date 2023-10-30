import java.util.*;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        // The default sort order for cars should be descending order of victories
        cars.sort(ProductionRemoteControlCar::compareTo);
        Collections.reverse(cars);
        return cars;
    }
}
