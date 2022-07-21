package day10_scanner;
import java.util.Scanner;
public class PersonalInfo {

    public static void main(String[] args) {


        /*create a class PersonalInfo
create a main method
create a Scanner object

Ask the user to enter their age (byte),
ask them to enter their favorite number (long),
and ask them if they are a student (boolean).
Print all the values from the inputs

         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        byte age = input.nextByte();

        System.out.println("Enter your favourite number");
        long favNumber = input.nextLong();

        System.out.println("Are you a student: true or false");
        boolean isStudent = input.nextBoolean();

        System.out.println("This is your personal info: ");
        System.out.println("Age: " + age);
        System.out.println("Favourite number: " +favNumber);
        System.out.println("Are you a student: " +isStudent);




    }
}
