package day29_arrays;

import java.util.Scanner;

public class PickMonth {

    public static void main(String[] args) {

        /*
        ask user to enter a month number
        print which month they select
        1-january
        ...
        12 - december
         */

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October","November","December"};

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a month number: ");
        int month = input.nextInt();

        System.out.println("The month you picked is: " + months[month-1]);
        //allows us to go from a number to an index. if user says first month coding shows position 2 since it counts from 0 so we do their input-1.

    }
}
