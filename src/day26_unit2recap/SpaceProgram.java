package day26_unit2recap;

import java.util.Scanner;

public class SpaceProgram {
    public static void main(String[] args) {

        /*
        given a string return a version with spaces between all of the letters.
        if there is already a space in the string put and underscore
        ex java--j a v a
           more words = m o r e _ w o r d s
         */
        Scanner input = new Scanner(System.in);

        System.out.println("What do you want to add spaces to");
        String str = input.nextLine().trim();

        String result = "";

        for(int i = 0; i<str.length();i++){

            if(str.charAt(i)==' '){
                result+= "_ ";
            }else {
                result += str.substring(i,i+1) + " ";
            }

        }
        System.out.println(result);

        String result2 = "";

        for(int i =0;i<str.length();i++){
            if(str.charAt(i)==' '){
                result2+= "_ ";
            }else{
                result2+= str.charAt(i) + " ";
            }
        }
        System.out.println(result2);


    }
}
