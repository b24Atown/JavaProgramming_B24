package day10_scanner;
import java.util.Scanner;
public class ChangeMachine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /* ask the user to enter some number from 1-99
        quarters
        dimes
        nickels
        pennies
         */

        System.out.println("Enter a number from 1-99");
        int num = input.nextInt();

        int quarters = num /25;
        num %= 25;

        int dimes =  num / 10;
        num %= 10;

        int nickles = num / 5;
        num  %= 5;

        int pennies  = num /1;
        System.out.println("quarters" + quarters + "dimes" + dimes + "nicklee" + nickles + "penny " + pennies);


        System.out.println(num);







    }
}
