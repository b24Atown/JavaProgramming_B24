package day26_unit2recap;

import java.util.Scanner;

public class MultiplyEnd {

    public static void main(String[] args) {

        /*
        given a string and a number return a string that has the ending character duplicated and attach  amount of times
        ex input: hello?
                   3
                   output: hello????
                   ex: input java
                   5
                   output: javaaaaaa

         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter your text");
        String text = input.nextLine();

        System.out.println("Enter number of times to repeat last letter");
        int number = input.nextInt();


        for(int i = 0; i< number;i++){
            text += text.charAt(text.length()-1);
        }
        System.out.println(text);

    }
}
