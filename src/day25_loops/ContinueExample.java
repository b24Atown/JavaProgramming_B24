package day25_loops;

public class ContinueExample {

    public static void main(String[] args) {

        for (int i = 0; i<100; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i<100; i++){
            if (i%2==0){
                continue;
            }
            System.out.print(i + " ");
        }
        //continue will skip the even mumbers even though the if statement says to print them. so it says i=0 since the statement is true, it goes to continue and goes to the next number. now i = 1, the if condition isnt met so it just prints the value 1. then updates to 2. if statement is true but it says to continue so goes directly to 3. and the loop continues like that


    }
}
