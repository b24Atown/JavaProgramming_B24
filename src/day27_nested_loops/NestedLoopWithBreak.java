package day27_nested_loops;

public class NestedLoopWithBreak {

    public static void main(String[] args) {

        for (int i = 1; i<=3;i++){

            System.out.println("first");
            for (int j = 1; j<=2;j++){
                if(j==2){ //this breaks the inner loop so only oone iteration of the inner loop is run
                    break;
                }
                System.out.println("second");
            }
        }
    }
}
