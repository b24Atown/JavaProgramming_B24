package day35_methods;

public class CountingNumbers {

    public static void Print0to5(){

        for(int i = 0; i<=5;i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void Print0toX (int n){//n will be the number the user defines
        for(int i = 0; i<=n;i++){
            System.out.print( i + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        Print0to5();
        Print0toX(7);
        Print0toX(9);
    }
}
