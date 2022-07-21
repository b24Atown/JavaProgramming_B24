package practice_problems;

import java.util.Arrays;

public class catdog {

    public static void main(String[] args) {

        String s1 = "alarm";
        String s2 = "cat";
        String word = "adkcatkjdscagalarmcscatalala";
        int cout1 = 0;
        int count2 = 0;

        for(int i = 0; i<word.length();i++){
            if(i<=word.length()-s1.length() && word.substring(i,i+s1.length()).equals(s1)){ //i in this statement will check for str.length-word.length so it doesnt go out of bounds
                cout1++;
            }
            if(i<=word.length() - s2.length() && word.substring(i,i+s2.length()).equals(s2)){
                count2++;
            }
        }
        System.out.println(cout1);
        System.out.println(count2);
        System.out.println(count2==cout1);
        System.out.println(freqOfWord(word, s1));
    }

    //write a method that will check how many times a given word is contained in a string

    public static int freqOfWord(String word, String checker){
        int count = 0;

        for(int i =0; i<word.length();i++){
            if(i<=word.length()-checker.length() && word.substring(i,i+checker.length()).equals(checker)){
                count++;
            }
        }


        return count;

    }

}
