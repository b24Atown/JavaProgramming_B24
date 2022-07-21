package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CountLetters {

    public static void main(String[] args) {

        //AAAABBCCCDDDDDEE
        //output A4B2C3D6C2
        System.out.println(countEachLetter("AAAABBCCCDDDDDEE"));


    }

    /*
    We start with String AABCDD
    String [] arr = str.split(""); -> [A,A,B,C,D,D] as String array
    Array.asList() -> this method accepts the arrays and coverts those arrays to an ArrayList
    Arrays.asList(arr) ->[A,A,B,C,D,D] as an  arrayList
    new ArrayList() -> when  we  put a collection type inside of the parenthesis it makes the ArrayList with those values

         */

    public static String countEachLetter(String str) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        String result = "";

        for (String each : list) {
            if (!result.contains(each)) {
                int count = Collections.frequency(list, each);
                result += each + count;
            }

        }
        return result;
    }
}
