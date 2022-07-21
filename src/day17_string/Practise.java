package day17_string;

import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        /*
        -  Write an if statement that assigns 5 to x when y is equal to 20-  Write an if statement that sets the variable fees to 50 if the Boolean variable max is true-  Write an if statement that assigns 20 to the variable a if variable b is 50 and c is greater and equal to 100-  Write an if statement that prints Ideal Temp if the temp is between 70 and 80
         */

        int y = 20;
        int x = 0;

        if (y == 20){
            x = 5;
        }else {
            x=7;

        }
        System.out.println(x);

        boolean max = true;
        int fee = 0;

        if (max == true) {
            fee = 50;

        }else {
            fee = 80;
        }
        System.out.println(fee);

        int a = 0;
        int b = 50;
        int c = 101;
        if (b==50 && c>=100){
            a = 20;

        }else {
            a=44;
        }
        System.out.println(a);

        int temp = 76;
        if (temp>=70 && temp <=80) {
            System.out.println("Ideal Temp");
        }else {
            System.out.println("Not ideal temp");
        }

        /*[If statement, operators]Write a program that will accept a boolean value. Print out the opposite of the given booleanEx: true -> falsefalse -> true

         */

        boolean ex = true;

        if(ex){
            System.out.println("false");
        } else {
            System.out.println("true");
        }

    }
}
