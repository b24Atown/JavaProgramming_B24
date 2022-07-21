package day16_switch;

import java.util.Scanner;

public class TernaryPractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the item name");
        String itemName = input.nextLine();

        System.out.println("Enter the price of " + itemName);
        double itemPrice = input.nextDouble();

        System.out.println("Do you have prime");
        String hasPrime = input.next();

        //Add shipping cost of 5$ if they dont have prime

        double finalPrice = hasPrime.equals("yes") ? itemPrice : itemPrice + 5;
        System.out.println("Your total price for " + itemName + "$" + finalPrice);
// if user says yes to prime, itemprice will be normal cost. if no then price gets added 5$
    }
}
