package day48_static;

public class IPhone {

    String model;
    String color;
    double price;
    double storage;

    static String brand;
    static String operatingSystem;

    public IPhone(String model, String color){
        this.model = model;
        this.color = color;
    }

    public IPhone(String model, String color, double price, double storage){
        this(model,color);
        this.price = price;
        this.storage = storage;
    }

    static {
        brand = "Apple";
        operatingSystem = "IOS";
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                '}';
    }
}
