package day10_scanner;

import java.util.Scanner;

public class DivisiblePractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*create a class Divisible
create a main method
create a Scanner object

Ask the user to enter a number. Check if that number is evenly divisible by 2, 3, and 5. Print the boolean values

    Ex:
    Enter a number
    65

    65 is divisible by 2: false
    65 is divisible by 3: false
    65 is divisible by 5: true

         */

        System.out.println("Enter a number");
        int num1 = input.nextInt();

        boolean isDivisibleBy2 = num1 % 2 == 0;
        boolean isDivisibleBy3 = num1 % 3 == 0;
        boolean isDivisibleBy5 = num1 % 5 == 0;

        System.out.println(num1 + " is divisible by 2: " + isDivisibleBy2);
        System.out.println(num1 + " is divisible by 3: " + isDivisibleBy3);
        System.out.println(num1 + " is divisible by 5: " + isDivisibleBy5);



    }
}
