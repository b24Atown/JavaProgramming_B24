package day05_variables;

public class CastingExamples {

    public static void main(String[] args) {

        long number = 90; //type is int, casts to long automatically
        long number2 = 100L; //once you put the L then it changes to Long

        short number3 =10;
        float number4 = number3;

        System.out.println(number4); //now instead of 10 it will be 10.0

        /*
        long number5 = 11;
        int number6 = number5;
        this doesnt work because you will have data loss
        how to do it underneath
         */

        long number5= 11;
        int number6 = (int)number5;

        System.out.println(number6);

        //in this case keep in mind it doesnt round up or down, just loses the decimal value
        double number7 = 40.5;
        int number8 = (int)number7;
        System.out.println(number8);

        //this loses data again because byte cant store that big of a number
        int number10 = 200;
        byte number11 = (byte)number10;
        System.out.println(number11);

        System.out.println((char) 97); //ascii 97 is letter a
        char letter = 'G';
        System.out.println((int)letter); //converts char to int

    }
}
