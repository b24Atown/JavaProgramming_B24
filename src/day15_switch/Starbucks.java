package day15_switch;

import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {

        /*
        Coffee
        tall, grande, venti
        price
        calories
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Starbucks");
        System.out.println("Which size would you like?");

        String coffee = input.next();
        double price = 0;
        int calories =0;
        boolean validOrder = true;

        switch (coffee){
            case "tall":
                price = 3.50;
                calories = 100;
                break;
            case "grande":
                price = 4.50;
                calories = 150;
                System.out.println();
                break;
            case "venti":
                price = 5.50;
                calories = 200;
                System.out.println();
                break;
            default:
                System.out.println("Invalid selection");
                validOrder = false;
        }


        if (validOrder) {
            System.out.println("Your order was a " + coffee);
            System.out.println("Your price is $ " + price);
            System.out.println("Total calories " + calories);

            
        }
    }
}
//the boolean was added so that in the end we can choose whether the statements at the very bottom get printed or not. so we said if it goes to default meaning invalid input. then the boolean value we can set as a false. now we create an if statement aroundd the print statements that means it only prints if we dont run to the default or if the selection is valid.