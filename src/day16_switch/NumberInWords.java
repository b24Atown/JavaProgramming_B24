package day16_switch;

import java.util.Scanner;

public class NumberInWords {
    public static void main(String[] args) {

        /*
        write a program that will display the given number in its word form. create for number 1-10. Any other number is invalid data
        ex: input:1
        output one
        input: 5
        output five
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Write a number");
        int num = input.nextInt();

        if (num>10 || num<1){
            System.out.println("Invalid number");
        }else if (num == 1){
            System.out.println("one");
        }else if (num == 2){
            System.out.println("two");
        }else if (num == 3) {
            System.out.println("three");
        }else if (num == 4) {
            System.out.println("four");
        }else if (num == 5){
        System.out.println("five");
        }else if (num == 6){
        System.out.println("six");
        }else if (num == 7) {
        System.out.println("seven");
        }else if (num == 8) {
        System.out.println("eight");
    }




        //Switch method;
        int number = input.nextInt();
        String word ="";

        switch (number){
            case 1: word = "one"; break;
            case 2: word = "two"; break;
            case 3: word = "three"; break;
            case 4: word = "four"; break;
            case 5: word = "five"; break;
            case 6: word = "six"; break;
            case 7: word = "seven"; break;
            case 8: word = "eight"; break;
            case 9: word = "nine"; break;
            case 10: word = "ten"; break;
            default: word = "invalid number";


        }
        System.out.println(number);
        System.out.println(word);
    }
}
