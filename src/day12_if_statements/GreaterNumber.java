package day12_if_statements;

public class GreaterNumber {
    public static void main(String[] args) {

        /*
        Write Java program that will have three numbers and print the greatest number.

    First number: 4
    Second number: 8
    Third number: 1

    Output:
    The greatest number from 4, 8, 1 is:  8
         */
        int firstNum = 4;
        int secondNum = 22;
        int thirdNum = 22;

        int biggest = 0;

        if (firstNum >= secondNum && firstNum >= thirdNum){
            biggest = firstNum;

        }
        if (secondNum >= firstNum && secondNum >= thirdNum) {
            biggest = secondNum;
        }
        if (thirdNum >= firstNum && thirdNum >= secondNum) {
            biggest = thirdNum;
        }
        System.out.println(biggest + " is the biggest number");

    }
}
