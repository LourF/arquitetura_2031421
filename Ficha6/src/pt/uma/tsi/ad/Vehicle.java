package pt.uma.tsi.ad;

public abstract class Vehicle {
    private int year;
    private String brand;
    private String model;
    private double price;
    private String color;

    public Vehicle(){
        this.year = 0;
        this.brand = "";
        this.model = "";
        this.price = 0.0;
        this.color = "";
    }

    public Vehicle(int year, String brand, String model, double price, String color) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "pt.uma.tsi.ad.Vehicle{" +
                "year=" + year +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }


}
