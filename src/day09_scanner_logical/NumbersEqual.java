package day09_scanner_logical;

import java.util.Scanner;

public class NumbersEqual {

    public static void main(String[] args) {

        Scanner  input = new Scanner(System.in);

        // ask the user to enter 2 numbers and check if the numbers are equal

        System.out.println("Enter number 1:");
        double numOne = input.nextDouble();
//this will show that number and the bottom line will allow for the input
        System.out.println("Enter number 2:");
        double numTwo = input.nextDouble();
// same thingi as previous line
        System.out.println(numOne + " is equal to " + numTwo + " : " + (numOne == numTwo));
//this line will take value of num1 and num2  and checking boolean question





    }
}
