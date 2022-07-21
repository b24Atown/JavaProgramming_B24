package day29_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        /*
        student array
        id-0
        first name - 1
        last name - 2
        batch number - 3
         */

        String[] info = {"Id","First Name", "Last Name","Batch Number"};
        //                 0       1             2             3

        String [] information = new String [4];
        //2nd way to make it
        information[0] = "ID";
        information[1] = "First Name";
        information[2] = "Last Name";
        information[3] = "Batch Number";

        Scanner input = new Scanner(System.in);

        String [] studentOne = new String[4];
        System.out.println("Enter your id");
        studentOne[0] = input.next();

        System.out.println("Enter your first name");
        studentOne[1] = input.next();
        System.out.println("Enter your last name");
        studentOne[2] = input.next();
        System.out.println("Enter your batch number");
        studentOne[3] = input.next();

        System.out.println(Arrays.toString(studentOne));
    }
}
