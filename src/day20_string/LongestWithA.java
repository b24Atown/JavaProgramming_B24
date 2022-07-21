package day20_string;

public class LongestWithA {
    public static void main(String[] args) {

        /*
        Given three string variables of some text find and print the longest word that also contains 'a'
        ex "java"
        "mouse" "computer" output: java
        ex"java"
        "mouse" "apples" output: apples
        challenge: instead of just checking for 'a' add another variable that can be used to check for any character.
         */
        String wordOne = "java";
        String wordTwo = "computador";
        String wordThree = "mouse";
        String biggest = "";

        if (wordOne.contains("a")&& wordOne.length() > biggest.length()){
            biggest=wordOne;
        }
        if (wordTwo.contains("a") && wordTwo.length() > biggest.length()){
            biggest = wordTwo;
        }
        if (wordThree.contains("a") && wordThree.length() > biggest.length()){
            biggest = wordThree;
        }
        System.out.println(biggest);

    }
}
