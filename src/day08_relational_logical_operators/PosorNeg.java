package day08_relational_logical_operators;

public class PosorNeg {

    public static void main(String[] args) {

        int number = -3;

        boolean isNegative = number < 0;
        boolean isZero = number == 0; //== this is a comparison. checks if its true
        boolean isPositive = number > 0;

        System.out.println(number + " is negative: " + isNegative);
        System.out.println(number + " is zero: " + isZero);
        System.out.println(number + " is positive: " + isPositive);


    }
}
