package day02;

public class Car {
    private String brand;
    private double motorSize;
    private int price;

    public Car(String brand, double motorSize, int price) {
        this.brand = brand;
        this.motorSize = motorSize;
        this.price = price;
    }

    public double decreasePrice(int percent) {
       return price -= price * percent / 100;
    }

    public String getBrand() {
        return brand;
    }

    public double getMotorSize() {
        return motorSize;
    }

    public int getPrice() {
        return price;
    }
}
