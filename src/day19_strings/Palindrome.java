package day19_strings;

public class Palindrome {
    public static void main(String[] args) {

        /*
        in this approach we will reverse the string manually
        then check if the string is the same as the original
         */
        String word = "abc";
        String reverse = "" + word.charAt(2) + word.charAt(1) + word.charAt(0);
        System.out.println(reverse);

        if (word.equals(reverse)){
            System.out.println("palindrome");
        }else {
            System.out.println("not a palindrome");
        }
        //how to check if a word is a palindrome. so we reversed the order and saved it as that. then we checked if statement word is the same. if true its palindrome. otherwise its not.
    }
}
