package practice_problems;

public class Seventeen {
    //17. Write  a method which can identifies given number is even or odd
    //EX:
    //identify(5) ->  "Odd"
    //identify(6) ->  "Even"

    public static void main(String[] args) {
        System.out.println(EvenOrOdd(5));
        System.out.println(EvenOrOdd(6));
    }

    public static String EvenOrOdd(int num){

        if(num%2==0){
            return "even";
        }else {
            return "odd";
        }
    }
}
