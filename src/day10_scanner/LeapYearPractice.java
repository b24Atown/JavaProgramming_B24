package day10_scanner;
import java.util.Scanner;
public class LeapYearPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*create a class LeapYear
create a main method
create a Scanner object

Ask the user to enter a year. Determine if the year is a leap year or not.
You can assume a leap year is a year that is divisible by 4. Print true or false.

Hint: use remainder operator
         */

        System.out.println("Enter a year");
        int year = input.nextInt();

        boolean isLeapYear = year % 4 == 0;
        System.out.println("Is a leap year: " + isLeapYear);



    }
}
