package day06_arithmetic_operators;

public class BasicCalculator {

    public static void main(String[] args) {

        double num1 = 10, num2 = 4;

        double addResult = num1 + num2;
        double subtractionResult = num1 - num2;
        double multiplicationResult = num1 * num2;
        double divResult = num1 / num2;
        double remainderResult = num1 % num2;

        //Approach 1 with variables
        System.out.println(num1 + " + " + num2 + " = " + addResult);
        System.out.println(num1 + " - " + num2 + " = " + subtractionResult);
        System.out.println(num1 + " * " + num2 + " = " + multiplicationResult);
        System.out.println(num1 + " / " + num2 + " = " + divResult);
        System.out.println(num1 + " % " + num2 + " = " + remainderResult);

        //Approach 2 with variables

        System.out.println("---------------------------------------------------");

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

        //bottom here explains why you have to put bracket at the end
        //parenthesis to group the numbers will allow for calculation first
        System.out.println("java" + 5 + 4);
        System.out.println("java" + (5+4));
        System.out.println(1 + 2 +"java");

        char a = 'A';
        char b = 'B';
        System.out.println("" + a + b); //concantenation
        System.out.println(a + b); // this adds the ascii values







    }
}
