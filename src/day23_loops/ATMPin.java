package day23_loops;


import java.util.Scanner;

public class ATMPin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int validPin = 1234;
        int userPin;
        int attempts = 0;

        do{
            System.out.println("Enter your pin");
            userPin = input.nextInt();
            attempts++;

        }while(userPin != validPin && attempts <3); // so 1234 makes while false so it loop stops.once attempts gets to more than 3, that also becomes false and program stops.

        if (userPin==validPin){
            System.out.println("Welcome, you are logged in");

        }else{
            System.out.println("locked out, too many attempts");
        }


    }
}
