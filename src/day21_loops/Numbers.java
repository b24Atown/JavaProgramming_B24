package day21_loops;

public class Numbers {
    public static void main(String[] args) {

        // go from 1-100 and priint onlh even mumbers

        int number = 1;

        while (number++ <=100){
            if (number%2==0){
                System.out.print(number + " ");
            }

        }

    }
}
