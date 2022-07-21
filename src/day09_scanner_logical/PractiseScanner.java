package day09_scanner_logical;

import java.util.Scanner;

public class PractiseScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num1 = input.nextInt();

        boolean isDivisibleBy2 = num1 % 2 == 0;
        boolean isDivisibleBy3 = num1 % 3 == 0;
        boolean isDivisibleBy5 = num1 % 5 == 0;

        System.out.println("Is divisible  by 2:" + isDivisibleBy2);
        System.out.println("Is divisible  by 3:" + isDivisibleBy3);
        System.out.println("Is divisible  by 5:" + isDivisibleBy5);


        /*create a class Divisiblecreate a main methodcreate a Scanner objectAsk the user to enter a number.
        Check if that number is evenly divisible by 2, 3, and 5.
        Print the boolean valuesEx:Enter a number6565 is divisible by 2: false65 is divisible by 3: false65 is divisible by 5: true
         */
    }
}
