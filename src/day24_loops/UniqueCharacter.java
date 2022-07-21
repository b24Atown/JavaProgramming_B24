package day24_loops;

import java.util.Scanner;

public class UniqueCharacter {
    public static void main(String[] args) {

        /*
        ask for a word
        ask for a letter
        is the letter unique in the word (it was only once in the string)

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();

        System.out.println("Select a letter in the word");
        char letter = input.next().charAt(0);

        int count = 0;

        for (int i = 0; i<word.length();i++){
            if(word.charAt(i) == letter){
                count++;
            }
        }
        if (count==1){
            System.out.println(letter + " is unique");
        }else if (count==0){
            System.out.println(letter + " is not in the string");
        }else {
            System.out.println("letter was not unique");
        }
    }
}
