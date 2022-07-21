package day25_loops;

public class Syllables {
    public static void main(String[] args) {

        /*Given a String seperated by dashes calculate how many syllables the words are
        ex: input ja-va
            output: 2
         */

        String str = "ja-va";
        int count = 0;

        for(int i = 0; i<str.length();i++){

           if(str.charAt(i) == '-'){
               count++;
           }


        }
        System.out.println(count + 1 + " is the amount of syllables ");
    }
}
