package day27_nested_loops;

public class NestedLoopExample {
    public static void main(String[] args) {


        //print hello world 5 times
        //print hello universe 1 time
        //print hello world 5 times
        // print hello universe 1 time

        for (int j = 0; j < 3; j++){
            for(int i = 0; i<5; i++){
                System.out.println("Hello world | J:" + j + " i:" + i);
            }
            System.out.println("Hello universe");
//flow. did the inner loop hello world 5 times, then checks outerloop. runs that. then innerloop runs again. then outerloop2 runs again. then inerloop. then outerloop3
        }
    }
}