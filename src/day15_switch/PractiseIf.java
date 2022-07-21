package day15_switch;

import java.util.Scanner;

public class PractiseIf {
    public static void main(String[] args) {


        /*

infant (< 1 year)
Toddler (2 - 5)
Kid (6 - 9
Pre-Teen (10 - 12)
Teenager (13 - 17)
Young Adult (18 - 20)
Adult (21 - 35)
Middle-Aged Adult (36 - 55)
Senior Citizen (55+)

Challenge: if age > 120 or less than 0 ==> invalid entry
         */
        Scanner input = new Scanner(System.in);

        System.out.println("How old are you");
        int age = input.nextInt();

        if (age >= 0 && age <= 120) {

            if (age <= 1) {
                System.out.println("Infant");
            } else if (age >= 2 && age <= 5) { // can also start doing if (age <=5) since previously we already took care of the previous conditioin
                System.out.println("Toddler");
            } else if (age >= 6 && age <= 9) { //agani here we can do if (age<=9) andd so on for the rest of them down
                System.out.println("kid");
            } else if (age >= 10 && age <= 12) {
                System.out.println("Pre-teen");
            } else if (age >= 13 && age <= 17) {
                System.out.println("Teen");
            } else if (age >= 18 && age <= 20) {
                System.out.println("Young Adult");
            } else if (age >= 21 && age <= 35) {
                System.out.println("Adult");
            } else if (age>=36 && age<=55) {
                System.out.println("Middle-Aged Adult");
            } else if (age >=56) { //here we can also do range 56-120 or we can also leave this as just an else since we covered all other conditions.
                System.out.println("Senior Citizen");
            }


        } else {
            System.out.println("Invalid entry");
        }
    }
}
