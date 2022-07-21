package day32_array;

import java.util.Arrays;
import java.util.Scanner;

public class SplitPractice2 {

    public static void main(String[] args) {

        //String input: 3 words
        //reverse the middle word

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 words");
        String sentence = input.nextLine();

        String [] split = sentence.split(" ");

        String reverse = "";

        for(int i = split[1].length()-1;i>=0;i--){
           reverse += split[1].charAt(i);
        }
        System.out.println(split[0] + " " + reverse + " " + split[2]);


    }
}
