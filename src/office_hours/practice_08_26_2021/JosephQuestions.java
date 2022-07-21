package office_hours.practice_08_26_2021;

import java.util.Arrays;

public class JosephQuestions {

    public static void main(String[] args) {


        //Q4: String -- Find the unique
        //Write a return  method that can find the unique characters from the String
        //Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";


        String word1 = "AAABBCDDDD";
        String word2 = "BBAAADDDDC";
        String reverse = "";

        for (int i = word1.length()-1; i >= 0; i--) {
            reverse += word1.charAt(i);
        }
        System.out.println(reverse);

        String removeDuplicate = "";
        for (int i = 0; i < word1.length(); i++) {
            if (!removeDuplicate.contains("" + word1.charAt(i))) {
                removeDuplicate += word1.charAt(i);


            }
        }
        System.out.println(removeDuplicate);


        for (int i = 0; i < word1.length()-1; i++) {
            if (word1.charAt(i) != word1.charAt(i+1)) {
                int countOfLetters = 0;
                for (int j = 0; j < word1.length()-1; j++) {
                    if (word1.charAt(j) == word1.charAt(i)) {
                        countOfLetters++;
                    }
                }
                System.out.println(word1.charAt(i) + "" + countOfLetters);
           }
        }

         char [] one = word1.toCharArray();
        char [] two = word2.toCharArray();
        Arrays.sort(one);
        Arrays.sort(two);
        boolean checker = false;

        for(int i = 0;i<one.length;i++){
            if (one[i]==two[i]){
                checker= true;
            }

        }
        System.out.println(checker);


    }
}
