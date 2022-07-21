package day14_if_statements;

import java.util.Scanner;

public class CalculatorV2 {

    public static void main(String[] args) {

        //ask user to enter 2 numbers
        // operator - String
        // -> 2nd num = 0

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        double numberOne = input.nextDouble();

        System.out.println("Enter the operator\n\t+ - * / %");
        String operator = input.next();

        System.out.println("enter number two");
        double numberTwo = input.nextDouble();

        boolean isValidOperator = operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("%");

        double result = 0;

        if(isValidOperator) {
            if (operator.equals("+")) {
                result = numberOne + numberTwo;
            } else if (operator.equals("-")) {
                result = numberOne - numberTwo;
            } else if (operator.equals("*")){
                result = numberOne / numberTwo;
            } else if (operator.equals("/") && numberTwo !=0) {
                result = numberOne/numberTwo;
            } else if (operator.equals("%")) {
                result = numberOne % numberTwo;
            }

        } else {
            System.out.println("Is not a valid operator");
        }
        System.out.println(numberOne + " " + operator + " " + numberOne + " = " + result);

    }
}
