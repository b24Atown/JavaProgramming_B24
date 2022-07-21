package day24_loops;

public class MultiplicationTable {
    public static void main(String[] args) {

        /*
        number
        num*1
        num*2
        num*3
         */

        int number = 8;

        for( int i = 1; i<10; i++){
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
