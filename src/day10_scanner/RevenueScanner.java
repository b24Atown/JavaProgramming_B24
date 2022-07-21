package day10_scanner;

import java.util.Scanner;
public class RevenueScanner {
    public static void main(String[] args) {

        /*create a class Revenue
create a main method
create a Scanner object

Ask the user to enter product price and quantity and then calculate the revenue. revenue = price × quantity.

         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a product price");
        double price = input.nextDouble();

        System.out.println("Enter the product quantity");
        int quantity = input.nextInt();

        double revenue = price * quantity;
        System.out.println("Revenue: $" + revenue);


    }
}
