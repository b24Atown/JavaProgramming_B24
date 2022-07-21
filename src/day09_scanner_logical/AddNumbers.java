package day09_scanner_logical;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter three numbers");
        int one = input.nextInt();
        int two = input.nextInt();
        int three = input.nextInt();
       // System.out.println(one + two + three);

        //or can do it like this

        String msg = one + " + " + two + " + " + three + " = ";
        System.out.println(msg + (one + two + three));



    }
}
