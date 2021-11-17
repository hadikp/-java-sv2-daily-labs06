package day02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    Car car;

    @BeforeEach
    void init () {
        car = new Car("Skoda", 1.5, 2_300_000);
    }

    @Test
    void testCar () {
        assertEquals("Skoda", car.getBrand());
        assertEquals(1.5, car.getMotorSize());
        assertEquals(2_300_000, car.getPrice());
    }

    @Test
    void testDecreaseCar () {
        double decreasePrice = car.decreasePrice(10);
        assertEquals(2_070_000, decreasePrice);
    }

}
