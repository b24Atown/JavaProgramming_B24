package day27_nested_loops;

public class NestedLoopExample2 {

    public static void main(String[] args) {

        for (int i = 0; i<5; i++){
            System.out.println("a");

            for(int j = 0; j<i;j++){
                System.out.println("b");
            }
            System.out.println(); //just giving i a space so we see each iteration
        }
    }
}
/*
              i=0
              printA
              j=0
              0<0 is false so no printing there
              i=1
              print A
              j=0
              0<1 so 1 B

              i=2
              j=0 B
              j=1 B
              so it goes like a, ab, abb, abbb


 */
