package day47_constructors;

public class Item {

    String name;
    int quantity;
    double price;
    double totalPrice;

    public Item (String name, int quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        calculatePrice();
    }

    public Item (String name){
        this.name = name;
    }

   public void calculatePrice(){
        totalPrice = quantity * price;
   }

   public String toString(){
        return "ITEM: " + name + " | Quantity: " + quantity + " | Total Price: $" + totalPrice;
   }



}
