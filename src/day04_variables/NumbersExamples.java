package day04_variables;

public class NumbersExamples {

    public static void main(String[] args) {

        //byte (dont need to use this, holds numbers from -127- to 128 or so. cant compute big numbers

        byte dateNumber = 31;
        System.out.println(dateNumber);


        //short (dont need to use this either. still holds small  range of #s but more than byte

        short numberTwo = 200;
        System.out.println(numberTwo);

        // int

        int intNumber;  // declaring an int variable called intNumber
        intNumber = 10000; //assign 10000 to my intNumber variable

        System.out.println(intNumber);

        // long

        long fourthNumber = 2344324;
        System.out.println(fourthNumber);

        // reasigning value. but remember reads top to bottom so first one will still show initial number
        fourthNumber= 123456;
        System.out.println(fourthNumber);




    }
}
