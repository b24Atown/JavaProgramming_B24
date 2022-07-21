package day09_scanner_logical;

import java.util.Scanner;

public class YourName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /* Ask the user to enter their first name
        ask the user to enter their last name
        print the full name
         */

        System.out.println("Enter First Name");
        String name = input.next();

        System.out.println("Enter Last Name");
        String lastName = input.next();

        System.out.println("Full name: " + name + " " + lastName);

    }


}
