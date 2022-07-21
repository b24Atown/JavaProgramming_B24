package day19_strings;

public class EachCharacter {

    public static void main(String[] args) {

        String java = "java";
        //             0123 positions

        // charAtt(number) gives a char based on the number you give

        System.out.println(java.charAt(0));
        System.out.println(java.charAt(1));
        System.out.println(java.charAt(2));
        System.out.println(java.charAt(3));

       // System.out.println(java.charAt((4)));
        //this would give you a problem because you dont have a char at number 4

        System.out.println("" + java.charAt(0) + java.charAt(1) + java.charAt(2) + java.charAt(3));
        //need to concantinate at first so it gives you the actual letters and doesnt add the numbers.

        System.out.println(java.charAt(0) + java.charAt(1) + java.charAt(2) + java.charAt(3));
        //without concantenating it gives you the additioin of all the char values



    }
}
