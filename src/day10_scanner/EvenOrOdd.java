package day10_scanner;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*create a class EvenOrOdd
create a main method
create a Scanner object

Ask the user to enter an int number, print if the number is even or odd as boolean values


         */

        System.out.println("Enter a number");
        long num = input.nextLong();

        boolean isEven = num % 2 == 0;
        boolean isOdd = num % 2  != 0;

        System.out.println(num + " is even: " + isEven);
        System.out.println(num + " is odd: " + isOdd);




    }


}
