package day05_variables;

public class MyName {

    public static void main(String[] args) {

        char letterOne = 'A';
        char letterTwo = 'r';
        char letterThree = 'd';
        char letterFour = 'i';
        char letterFive = 't';

        System.out.println("Name = " + letterOne + letterTwo + letterThree + letterFour + letterFive);

        //it wont work if you dont put quotation marks in the front. what it did was it added
        //the ascii value of each letter. example below. Concantination (+) makes it into
        //a string value.

        System.out.println( + letterOne + letterTwo + letterThree + letterFour + letterFive);

        //if you put the quotation marks after it reads left to right so it doesnt change it

        System.out.println( + letterOne + letterTwo + letterThree + letterFour + letterFive + "My name is");


        //print would also work
        System.out.print(letterOne);
        System.out.print(letterTwo);
        System.out.print(letterThree);
        System.out.print(letterFour);
        System.out.print(letterFive);


        //how to do it in ascii. I put a blank println to go  to next line from print above

        char asci1 = 65;
        char asci2 = 114;
        char asci3 = 100;
        char asci4 = 105;
        char asci5 = 116;
        System.out.println();

        System.out.println("Name = " + asci1 + asci2 + asci3 + asci4 + asci5);







    }
}
