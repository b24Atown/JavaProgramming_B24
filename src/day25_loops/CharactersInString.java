package day25_loops;

public class CharactersInString {
    public static void main(String[] args) {

        /*
        Given a String print the ascii value codes for each character
        ex:  input: "java"
        output: 106 97 118 97
         */

        String word = "java";

        for (int i = 0; i< word.length(); i++){
            System.out.print((int)word.charAt(i) + " "); // so we typecast the int into a char, evaluated each letter starting from position 0, then we put a space inbetween so each char value is given with a space inbetween.
        }
    }
}
