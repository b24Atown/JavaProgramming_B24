package day47_constructors;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {

    public static void main(String[] args) {

        Item firstItem = new Item("Apples", 5, 1.33);

        System.out.println(firstItem); //printing our info
        firstItem.quantity +=5; //now adding 5 more apples
        firstItem.calculatePrice(); //need to update totalPrice. reason this has to be updated is because method has already been called and printed. so we had to go back and call reupdate it
        System.out.println(firstItem); // now shows updated

        Scanner input = new Scanner(System.in);

        String keepGoing = "yes";

        ArrayList<Item> shoppingList = new ArrayList<>();

        while (keepGoing.equalsIgnoreCase("yes")){
            System.out.println("What is the item name?");
            String name = input.nextLine();

            System.out.println("What is the quantity?");
            int quantity = input.nextInt();

            System.out.println("What is the unit price?");
            double unitPrice = input.nextDouble();

            Item item = new Item (name,quantity,unitPrice);//everytime loop runs the item gets reset to a new object so no need to enter new info.
            shoppingList.add(item);

            System.out.println("Do you want to keep adding items");
            input.nextLine(); //empty enter input

            keepGoing = input.nextLine();

        }

        System.out.println("\nShopping List:");
        System.out.println(shoppingList);

    }

}
