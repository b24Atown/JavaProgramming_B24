package day15_switch;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Java Hotel");
        System.out.println("How many days will you stay");
        int  numberOfDays = input.nextInt();
        System.out.println("How many people are in your party");
        int numberOfPeople = input.nextInt();


        double price = 0;

        String roomType = "";
        boolean validPartySize = true;
        String peopleMsg  = "people";

        switch (numberOfPeople){

            case 1:
                roomType = "Single Room";
                price = numberOfDays * 100;
                peopleMsg = "person";
                break;
            case 2:
                roomType = "Double Room";
                price = numberOfDays * 125;
                break;
            case 3:
            case 4:
                roomType = "Large room";
                price = numberOfDays * numberOfPeople * 150;
                break;
                //When the value is 3 or 4. it will run the same code
            case 5:
            case 6:
                roomType = "Suite";
                price = 1000;
            break;
            default:
                System.out.println("Party size is too big");
                validPartySize = false;
        }

        if (validPartySize) {


            System.out.println("There are " + numberOfPeople + " " + peopleMsg);
            System.out.println("Youre staying for " + numberOfDays + " days");
            System.out.println("Final price is $" + price);
            System.out.println("For a " + roomType);

        }




        

    }
}
