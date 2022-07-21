package day05_variables;

import java.sql.SQLOutput;

public class WatchInfo {

    public static void main(String[] args) {

        String brand = "Apple";
        String color = "Black";
        double price = 499.99;
        boolean isWaterResistant = true;
        boolean isSmart = true;

        System.out.println("\t\t\tSmartWatch Info");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println();
        System.out.println("This watch comes with a 3 year warranty. It has the technology");
        System.out.println("of water resistance " + isWaterResistant);
        System.out.println("Best of all it is a smartwatch " + isSmart);



    }
}
