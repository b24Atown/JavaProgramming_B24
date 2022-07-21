package day23_loops;

public class DoWhileExample {
    public static void main(String[] args) {


        do {
            System.out.println("hello");
        }while(false); //since this is false it only runs it one time and will stop after that. if it was true it would keep running until it hits a false condition.

        int n = 5;
        do{
            System.out.println("wazzapp");
            n++;
        }while (n<10); //the stop condition here is once n becomes 10.
    }
}
