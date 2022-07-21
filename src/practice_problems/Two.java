package practice_problems;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Two {

    public static void main(String[] args) {

        //Q2: String -- Same letters
        //Write a return method that check if a string is build out of the same letters as another string.
        //Ex:  same("abc",  "cab"); -> true
        //same("abc",  "abb"); -> false:

        String one = "abc";
        String two = "cab";

        char [] arrOne = one.toCharArray();
        char [] arrTwo = two.toCharArray();

        Arrays.sort(arrOne);
        Arrays.sort(arrTwo);
        boolean same = false;
        //could also do if (arrone[i] == arrtwo[i])
        if (Arrays.equals(arrOne,arrTwo)){
            same = true;
        }

        System.out.println(same);

    }
}
