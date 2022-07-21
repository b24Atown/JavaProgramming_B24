package day05_variables;

public class CellPhone {

    /*------------------------------------------------------------
Task

Add new a class CellPhone
Add main method

Create and assign there variables
    brand, model, color, price, storage, hasCamera

Print all the variables
------------------------------------------------------------
     */

    public static void main(String[] args) {

        String brand = "Samsung";
        String model = "Galaxy S9";
        String color = "Black";
        double price = 500.99;
        String storage = "64GB";
        boolean hasCamera = true;

        System.out.println("Information for the " +model);
        System.out.println(model + " is a " + brand + " phone");
        System.out.println("This phone comes in " + color + " and has " + storage + " of memory");
        System.out.println("Has a Camera: " + hasCamera);
        System.out.println("All of this for $" + price);

        //approach two

        String info = "\t\t\tInformation for the " +model + "\n" + model + " is a " + brand + " phone" + "\n" + "This phone comes in " + color + " and has " + storage + " of memory" + "\n" + "Has a Camera: " + hasCamera + "\n" + "All of this for $" + price;
        System.out.println(info);






    }
}
