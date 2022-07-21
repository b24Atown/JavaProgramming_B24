package office_hours.practice_10_11_2021;

public abstract class Phone {
    String brand;
    String model;
    double price;
    int size;

    public Phone(String brand, String model, double price, int size){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.size=size;
    }

    public abstract void calling();
    public abstract void texting();

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Price " + price + ", Size: " + size;
    }
}
