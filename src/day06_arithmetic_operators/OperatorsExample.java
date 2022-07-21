package day06_arithmetic_operators;

public class OperatorsExample {

    public static void main(String[] args) {

        System.out.println(10 - 5);
        System.out.println(10 * 5);

        //int / int which gives us int
        System.out.println(10 / 5);

        //double / int gives us double
        System.out.println(10.0 / 5);

        //double / double gives us double
        System.out.println(10.0 / 3.0);

        //changed to int so no longer getting the decimal value
        System.out.println( (int) (10.0 / 3.0) );

        // now just the 10.5 gets changed to int and 3.0 remains double
        System.out.println( (int) 10.5 / 3.0 );


        System.out.println(10.5 / 3.0);

        //now its all cast to an int so no decimal values. now 10/3 which is 3.333 and therefore 3
        System.out.println((int) (10.5 / 3.0));

        byte b1 = 10;
        byte b2 = 5;
        //b1 + b2 = 15. the output is int because that's the default

        //byte b3 = b1 + b2;  this is an error
        int b3 = b1 + b2; //works with int because it gets automatically converted to int
        byte b4 = (byte) (b1 + b2); //now its been typecasted to byte so it works

        System.out.println(b4);

        System.out.println(10 % 3); // 10 = (3+3+3) + 1   % = remainder
        System.out.println(15 % 3); //no remainder
        System.out.println(15 % 4); // so again 4+4+4=12, 3 remain











    }
}
