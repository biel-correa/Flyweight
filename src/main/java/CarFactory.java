import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    private static final Map<String, Car> cars = new HashMap<>();

    public static Car getCar(String model) {
        Car car = cars.get(model);

        if (car == null) {
            car = new Car(model);
            cars.put(model, car);
        }

        return car;
    }

    public static int getNumberOfCars() {
        return cars.size();
    }
}
