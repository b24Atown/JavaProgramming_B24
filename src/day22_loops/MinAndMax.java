package day22_loops;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {

        /*
        write a program tht asks user to enter 5 numbers and returns the minimum and maximum numbers
         */
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int max = -2147483647;//we used smallest possible value for max so any bigger number can take over it
        int min =  2147483647;//we used biggest possible value for min so any smaller number can take over it

        while(counter<=5){
            counter++;

            System.out.println("Enter a number");
            int number = input.nextInt();

            if (number>max){
                max = number;
            }
            if (number < min){
                min = number;
            }



        }
        System.out.println("max number is : " + max);
        System.out.println("min number is: " + min);



    }
}
