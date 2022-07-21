package day26_unit2recap;

import java.util.Locale;
import java.util.Scanner;

public class CreateID {
    public static void main(String[] args) {

        /*
        given a first name and a last name create and return an id using the following format:
        the first letter of the first name as lowercase;
        the first 3 letters of the last name with the first letter as upperacase and the rest lowercase,
        the length of the first string multiplied by 2.

        firstt name: john
        last name: smith
        id:jSmi8



         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String first = input.next().toLowerCase();

        System.out.println("Enter your last name");
        String last = input.next().toLowerCase();

        String id = "" + first.charAt(0) + last.substring(0,1).toUpperCase() + last.substring(1,3);
        id += first.length() *2;

        System.out.println("ID generated: " + id);

    }
}
