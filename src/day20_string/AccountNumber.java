package day20_string;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {

        /*
        Declare a variable account number (String). you will check iff these account numbers are valid
        -If the account number begins with a "2" the account number should be 7 characters long
        Print: "Valid 7-digit account number" Otherwise: "Invalid 7-digit account number"
        -If the account number begins with a "5" the account number should be 10 characters long.
        Print: "Valid 5-digit account number" Otherwise: "Invalid 5-digit account number"
        -If the account number does not begin with a 2 or a 5, Print "Invalid account number"
         */

        String accountNumber = "2334156";
        //3 ways to check if it starts with 2.
        //startsWith("2")    charAt(0)    substring(0,1).equals("2")

        if (accountNumber.startsWith("2")){

            if(accountNumber.length() == 7) {
                System.out.println("Valid 7 digit account number");
            }else {
                System.out.println("Invalid 7 digit account number");
            }

        }else if (accountNumber.startsWith("5")) {
            if (accountNumber.length() == 10) {
                System.out.println("Valid 5 digit account number");
            }else{
                System.out.println("Invalid 5 digit account number");
            }
        }else {
            System.out.println("Invalid account number. Needs to start with 2 or 5");
        }

    }
}
