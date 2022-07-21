package day09_scanner_logical;
import java.util.Scanner;
public class ScannerLeapYear {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year");
        int year = input.nextInt();

        boolean isLeapYear = year %4 ==0;
        System.out.println("Is a leap year: " + isLeapYear);






    }
}


/*create a class LeapYearcreate a main methodcreate a Scanner objectAsk the user to enter a year.
Determine if the year is a leap year or not. You can assume a leap year is a year that is divisible by 4.
Print true or false.Hint: use remainder operator
 */

