package day34_methods;

import java.util.Arrays;
import java.util.Scanner;

public class CreateMultiiArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String [][] allWords = new String[3][];

        System.out.println(Arrays.deepToString(allWords));
        //today is sunday...then pull each individual words from there
        System.out.println("Enter multiple words seperated by space");
        String [] first = input.nextLine().split(" ");
        System.out.println(Arrays.toString(first));

        allWords[0] = first;

        allWords[1] = input.nextLine().split(" ");

        System.out.println("Enter the last set of words");
        String word = input.nextLine();
        String [] wordArr = word.split(" ");
        allWords[2] = wordArr;

        //all 3 methods uptop do same thing just different ways
        System.out.println(Arrays.deepToString(allWords));

    }
}
