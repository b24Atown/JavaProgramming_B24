package day19_strings;

import java.util.Locale;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        /*
        ask the userer to enter their first name
        ask the user to ente rtheir last name
        then print the initials
        bonus give the initials as uppercase
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String name = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        String initials = "" + name.charAt(0) + lastName.charAt(0);

        System.out.println(initials.toUpperCase());

        String initials2 = ""+ name.substring(0,1) + lastName.substring(0,1);
        System.out.println(initials2.toUpperCase());


    }
}
