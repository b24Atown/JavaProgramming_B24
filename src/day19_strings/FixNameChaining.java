package day19_strings;

import java.util.Scanner;

public class FixNameChaining {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enterr your first name");
        String name = input.nextLine().trim().toLowerCase();
        //so we made it so the spaces get trimmed, and all letters come to lower case

        System.out.println("Enter your last name");
        String lastName = input.nextLine().trim().toLowerCase();
        //same as above

        String fixedFirstName = name.substring(0,1).toUpperCase() + name.substring(1);
        String fixedLastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
        //up there we said first name letter 1 is uppercase. + the letters from the erst of the name.
        //same thing was done with last name
        //so we first made all lettes lower case, trimmed so no spaces anywhere, now we made first letter uppercase, and added the rrerst of the lettesr from a certain point.
        System.out.println(fixedFirstName);
        System.out.println(fixedLastName);




    }
}
