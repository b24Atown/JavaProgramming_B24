package day25_loops;

public class RemoveDuplicates {
    public static void main(String[] args) {

        /*
        Write a program that can remove duplicates from a String
        ex: input: abcabc     output: abc
         */

        String word = "abcabc";
        String newWord = "";

        for(int i = 0; i<word.length(); i++){
            if (!newWord.contains("" + word.charAt(i))){
                newWord+= word.charAt(i);
            }
        }
        System.out.println(newWord);
    }
}
