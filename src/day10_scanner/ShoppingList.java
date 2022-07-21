package day10_scanner;
import java.util.Scanner;
public class ShoppingList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        In this assignment you will write a program to create a shopping list and prices.

You will use Scanner object and ask user to enter 3 items followed by its price and you will calculate total price and show as a report.

-Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice

-Create a Scanner object named scan.

Example:
Enter Item1 and its price:
Tomatoes
5.5
"Enter Item2 and its price:
Cheese
3.5
Enter Item3 and its price:
Apples
6.3

Output:
Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
Total price: 15.3
         */

        String item1, item2, item3, report = "";
        double price1, price2, price3, totalPrice;
        //could have also done totalPrice=0;  then bottom of each line after price you could have done totalPrice += price1...etc for all

        System.out.println("Enter item 1 and its price");
        item1 = input.next();
        price1 = 5.5;
        price1 = input.nextDouble();
        report += "Item 1: " + item1 + " Price: " + price1 + ", ";


        System.out.println("Enter item 2 and its price");
        item2 = input.next();
        price2 = 3.5;
        price2 = input.nextDouble();
        report += "Item 2: " + item2 + " price 2: " + price2 + ", ";


        System.out.println("Enter item 3 and its price");
        item3 = input.next();
        price3 = 6.5;
        price3 = input.nextDouble();
        report += "Item 3: " + item3 + " price 3: " + price3+ ", ";



        totalPrice = price1 + price2 + price3;

        System.out.println(report);
        System.out.println("Total Price" + totalPrice);


    }

}
