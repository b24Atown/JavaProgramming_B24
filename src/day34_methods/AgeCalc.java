package day34_methods;

import java.util.Scanner;

public class AgeCalc {
    public static void main(String[] args) {

        getAge(2000);

        getAge(1990);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birth year");
        int year = input.nextInt();//the year in here is not the same thing as the year that was used in the class we created. that variable is local to that method. we can only extract the value from there.

        getAge(year);

    }

    public static void getAge(int year){
        System.out.println("Your age in 2021 is");
        System.out.println(2021-year);

    }

}

