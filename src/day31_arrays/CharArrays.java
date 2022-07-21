package day31_arrays;

import java.util.Arrays;

public class CharArrays {

    public static void main(String[] args) {

        char [] letters = {'j','a','v','a'};

        //how to convert a String to a char array

        String s = "java is fun";

        s.toCharArray();
        char[] java = s.toCharArray();
        //so to convert String to char array you have to create char array = variable.toCharArray();

        System.out.println(Arrays.toString(java));
        System.out.println(Arrays.toString(letters));
    }
}
