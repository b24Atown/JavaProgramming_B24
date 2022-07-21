package day10_scanner;

import java.util.Scanner;
public class ChangeMachine2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       /* ask the user to enter some number from 1-99
        quarters
        dimes
        nickels
        pennies
         */
        int money, quarters, dimes, nickles, pennies;


        System.out.println("Hello, welcome to the change machine");
        System.out.println("Please enter your change");
        money = input.nextInt(); //83

        quarters = money / 25; //83 / 25 -> 3. new value needs to be 83-75
        money %= 25; //money now equals 8
        dimes = money / 10; //  8/10
        money %= 10; // 8% 10 -> 8 therefore no dimes
        nickles = money / 5; // 8/5 -> 1. 8-5 = 3 cents left over
        money %= 5; //3
        pennies = money; //just what was left over

        System.out.println("Your change is:");
        System.out.println("quarters: " + quarters);
        System.out.println("dimes: " + dimes);
        System.out.println("nickles: " + nickles);
        System.out.println("pennies: " + pennies);


    }
}
