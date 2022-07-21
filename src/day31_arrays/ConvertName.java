package day31_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertName {
    public static void main(String[] args) {

        //ask user to enter their first name  display each character as an array

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.next();

        char [] name = firstName.toCharArray();
        //can also do System.out.println(Arrays.toString(firstName.toCharArray()));

        System.out.println(Arrays.toString(name));
        //can also do
        // System.out.println(firstName.toCharArray()[0]);
        System.out.println(name[0]);
        System.out.println(name[name.length-1]);
        System.out.println(name[0] + " " + name[1]);
    }
}
