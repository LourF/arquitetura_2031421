package pt.uma.tsi.ad;

public class Car extends Vehicle {

    private int doors;

    public Car() {
        super();
        this.doors = 0;
    }

    public Car(int year, String brand, String model, double price, String color) {
        super(year, brand, model, price, color);
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Car" ;
    }
}
