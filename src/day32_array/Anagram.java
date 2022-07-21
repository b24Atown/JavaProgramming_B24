package day32_array;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        /*
        2 words are anagram if they are built up of the same character
        ex abc   bca
         */

        String wordOne = "listen";
        String wordTwo = "silent";

        char [] one = wordOne.toCharArray();
        char [] two = wordTwo.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);

        System.out.println("Is anagram " + Arrays.equals(one,two));




    }
}
