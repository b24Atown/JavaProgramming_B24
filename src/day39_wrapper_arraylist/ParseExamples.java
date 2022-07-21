package day39_wrapper_arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class ParseExamples {

    public static void main(String[] args) {
        //converting the string characters to a number

        String year = "2009";

        int intYear = Integer.parseInt(year);
        System.out.println(year);
        System.out.println(intYear);

        System.out.println(year + 1);//just shows 20091
        System.out.println(intYear + 1); //takes 2009 number and adds 1


        /*
        Ask the user to enter some text
        I am x years old
        in 5 years you will be : $age
         */

        Scanner input = new Scanner(System.in);
        System.out.println("How old are you");
        String text = input.nextLine();

        String ageText = text.split(" ")[2];//since it returns an array. were saying we want the 2nd element of the array
        //could also have done it this way.  String[] arr = text.split(" ");
        //                             then  String ageText = arr[2];

        int age = Integer.parseInt(ageText);
        System.out.println("In 5 years you will be " + (age + 5));


        String priceStr = "112.99";
        double priceDouble = Double.parseDouble(priceStr);
        System.out.println(priceDouble);





    }

}
