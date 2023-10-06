import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTest {

    CarFactory carFactory;

    @BeforeEach
    void setUp() {
        carFactory = new CarFactory();
    }

    @Test
    void shouldReturnSameCar() {
        Car car1 = CarFactory.getCar("Ford");
        Car car2 = CarFactory.getCar("Ford");

        assertEquals(car1, car2);
    }

    @Test
    void shouldReturnDifferentCars() {
        Car car1 = CarFactory.getCar("Ford");
        Car car2 = CarFactory.getCar("Chevrolet");

        assertNotEquals(car1, car2);
    }

    @Test
    void shouldReturnNumberOfCars() {
        CarFactory.getCar("Ford");
        CarFactory.getCar("Chevrolet");
        CarFactory.getCar("Dodge");

        assertEquals(3, CarFactory.getNumberOfCars());
    }

    @Test
    void shouldReturnDifferentOwners() {
        Owner owner1 = new Owner("John", "Ford");
        Owner owner2 = new Owner("John", "Chevrolet");

        assertNotEquals(owner1, owner2);
    }
}