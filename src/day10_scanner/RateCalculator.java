package day10_scanner;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*create a class RateCalculator
create a main method
        create a Scanner object

        Ask the user to enter a salary (double)
        Print the hourly rate (double) of the employee
        assume that one year has 52 weeks
                hourRate = salary / (weeklyHour * 52)

         */

        System.out.println("Enter your salary");
        double salary = input.nextDouble();

        System.out.println("How many hours do you work per week");
        int hours = input.nextInt();

        double hourlyRate = salary / (52 * hours);

        System.out.println("Your salary  is: " + salary  + " your hourly rate is: " + hourlyRate);


    }
}
