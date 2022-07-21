package office_hours.practice_08_26_2021;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Question2 {

    public static void main(String[] args) {

        //Q2: String -- Same letters
        //Write a return method that check if a string is build out of the same letters as another string.
        //Ex:  same("abc",  "cab"); -> true
        //same("abc",  "abb"); -> false:

        String one = "abc";
        String two = "cnb";

        char [] wordOne = one.toCharArray();
        char [] wordTwo = two.toCharArray();

        Arrays.sort(wordOne);
        Arrays.sort(wordTwo);
        boolean isAnagram = false;

        if(Arrays.equals(wordOne,wordTwo)){
            isAnagram = true;
        }
        System.out.println(isAnagram);
    }
}
