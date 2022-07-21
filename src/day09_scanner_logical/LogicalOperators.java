package day09_scanner_logical;

public class LogicalOperators {

    public static void main(String[] args) {

        /* math ex:  3 < i < 40

         */

        int i = 5;

        boolean output = i > 3 && i < 40; //true && true therefore output is true
        System.out.println(output);

        boolean output2 = i < 3 || i > 40; // false || false therefore output is false
        System.out.println(output2);

        //so we checked if a number is within a range or outside a range

        int min = 3;
        int max = 40;

        System.out.println( i > min && i < max); //true && true therefore true.
        // 5 is more than 3 and 5 is less than 40

        System.out.println( i < min || i > max);//false || false therefore false
        System.out.println(true || false && true);// && takes precedence so gets done first.
        //so it becomes true || false. so that means true.









    }
}
