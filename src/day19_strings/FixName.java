package day19_strings;

import java.util.Locale;
import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {

        /*
        ask user to enter therr first name
        ask user to enter their last name
        make sure the name is properly formatting
        each first lettter of both names is capital and the rest are lowercase
        ex. james bond
        output James Bond
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enterr your first name");
        String name = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        String firstNameFirstLetter = name.substring(0,1);
        String lastNameFirstLetter = lastName.substring(0,1);

        firstNameFirstLetter = firstNameFirstLetter.toUpperCase();
        lastNameFirstLetter = lastNameFirstLetter.toUpperCase();

        String remainingFirstName = name.substring(1);
        String remainingLastName = lastName.substring(1);

        remainingFirstName = remainingFirstName.toLowerCase();
        remainingLastName = remainingLastName.toLowerCase();
        System.out.println(firstNameFirstLetter + remainingFirstName + " " + lastNameFirstLetter + remainingLastName);

    }
}
