package day25_loops;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {

        //given a sentence determine how many words are in the String.
        //ex input: this has multiple words      output: 4

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your sentence");
        String sentence = input.nextLine().trim(); //trim just so spaces dont mess it up

        int wordsAmmount = 0;

        for(int i = 0; i<sentence.length(); i++){
            if(sentence.charAt(i) == ' '){
                wordsAmmount++;
            }
        }
        System.out.println("There are " + (wordsAmmount + 1) + " words in the sentence");
    }
}
