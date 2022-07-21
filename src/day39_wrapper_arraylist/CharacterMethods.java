package day39_wrapper_arraylist;

public class CharacterMethods {

    public static void main(String[] args) {

        /*
        to find if a character was uppercase
        loop through the character
        char>='A' and char <='Z'
         */

        System.out.println(Character.isUpperCase('a'));//false
        System.out.println(Character.isUpperCase('A'));//true
        System.out.println(Character.isLowerCase('b'));//true
        System.out.println(Character.isDigit('b'));//false
        System.out.println(Character.isDigit('9'));//true

        char [] arr = {'w','E','4'};
        int count = 0;

        for(int i = 0; i<arr.length;i++){
            if(Character.isDigit(arr[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}
