package day31_arrays;

import java.util.Scanner;

public class ReverseSentence {

    public static void main(String[] args) {

        //ask user to enter a sentence and reverse your sentence
        //ex today is wednesday...wednesday is today

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence = input.nextLine();

        String [] reverse = sentence.split(" ");
        String newOrder = "";

        for( int i = reverse.length - 1;i>=0;i--){
            newOrder+= reverse[i] + " ";

        }
        System.out.println(newOrder.trim());
    }
}
