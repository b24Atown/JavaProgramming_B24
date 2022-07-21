package day34_methods;

public class GetCharacters {

    /*
    make a method that will print all letters from A to Z
    make a method that will print all letters from a to z
    make a method that will print all letters from Z to A
    make a method that will print all letters from z to a
    make a method that will print all letters from 0 to 9
     */

    public static void printLettersAToZInUppercase() {

        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println(); //this makes sure we have a space after this method is used. meaning it goes to the next line the next action you do.

    }

    public static void printLettersAToZInLowercase() {
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();


    }

    public static void printLettersZToAInLowercase() {
        for (int i = 'z'; i >= 'a'; i--) {
            System.out.print((char) i + " ");
        }
        System.out.println();
    }

    public static void printLettersZToAInUppercase() {
        for (int i = 'Z'; i >= 'A'; i--) {
            System.out.print((char) i + " ");
        }
        System.out.println();

    }

    public static void print0To9(){
        for(int i = 0;i<=9;i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }






}
