package day09_scanner_logical;
import java.util.Scanner;

public class Revenue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter product price");
        double price = input.nextDouble();

        System.out.println("Enter Quantity");
        int quantity = input.nextInt();

        double revenue = price * quantity;

        System.out.println("My revenue is " + revenue);





        /*create a class Revenue create a main method create a Scanner object
        Ask the user to enter product price and quantity and then calculate the revenue. revenue = price Ã quantity.
         */
    }
}
