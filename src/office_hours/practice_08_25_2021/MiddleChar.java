package office_hours.practice_08_25_2021;

import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {

        //Given a string write a program to display the middle character of a string
       // if the length of the string is even, there will be two middle characters
        //if the length is odd, there will be one middle character.
        //ex input elephant, output ph

        Scanner input = new Scanner(System.in);

        System.out.println("Write a word");
        String word = input.next();

            char middlechar = word.charAt(word.length()/2);
            char middlechar2 = word.charAt(word.length()/2-1);
            if(word.length() %2==0){

                System.out.println(middlechar + "" + middlechar2);
                System.out.println(word.substring(word.length()/2-1,word.length()/2+1));
            }else{
                System.out.println(middlechar);
                System.out.println(word.substring(word.length()/2,word.length()/2+1));

            }

        }

}
