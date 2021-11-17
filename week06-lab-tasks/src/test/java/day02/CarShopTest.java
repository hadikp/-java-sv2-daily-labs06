package day02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarShopTest {

    CarShop carShop;
    Car car;

    @BeforeEach
    void init() {
        carShop = new CarShop("Skoda Auto kft.", 10_000_000);
        car = new Car("Skoda", 1.2, 2_300_000);

    }

    @Test
    void testCarShop () {
        assertEquals("Skoda Auto kft.", carShop.getCarShopName());
        assertEquals(10_000_000, carShop.getMaxPrice());
        assertEquals(0, carShop.getCarsForSell().size());
    }

    @Test
    void testAddChar () {
        boolean result = carShop.addCar(car);
        assertTrue(result);
        assertEquals(1, carShop.getCarsForSell().size());
        assertEquals(2_300_000, carShop.getCarsForSell().get(0).getPrice());
    }

    @Test
    void testAddCharFalse () {
        boolean result = carShop.addCar(new Car("Skoda", 1.2, 12_300_000));
        assertFalse(result);
        assertEquals(0, carShop.getCarsForSell().size());
    }

    @Test
    void testsumCarPrice () {
        carShop.addCar(car);
        carShop.addCar(new Car("Toyota", 1.5, 3_000_000));
        assertEquals(5_300_000, carShop.sumCarPrice());
    }
}
