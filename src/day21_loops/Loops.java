package day21_loops;

public class Loops {
    public static void main(String[] args) {

        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("___________________");

       // while(true){
         //   System.out.println("Hello world"); // while this condition is true, this statement will keep running. this is an infinite loop. we need a loop that will eventually end.
     //   }
        int number = 0;
        while (number<=10) {
            System.out.println("Hello world" + number);
            number++; //
            //the +number in the print statement is there to show us which number were currently at. we need to increment the number as well because without it it just runs the same loop. incrementing is neccessary to reach your stop statement. also while loop needs to be a boolean statement to run.
        }

        System.out.println();

        int number2 = 1;
        while (number2<=10){
            System.out.println("Hello world " + number2++);
        }
        System.out.println();

        int number3 = 1;
        while (number3 <=10){
            System.out.println("Hello universe " + ++number3);
        }
        //because we preincremented here it runs an extra time
    }
}
