package day07_unary_operators;

public class Increment2 {

    public static void main(String[] args) {

        int i = 5;
        i++; //if next line is print i. i is 6
        int x = i++; //inx becomes 6 since the increment of i happens after
        System.out.println("x:" +x); //so x is 6
        System.out.println("i:" +i);//now i has been incremented and it is 7

        int b = 10;
        int c = ++b;
        System.out.println("b:" + b); //b becomes 11
        System.out.println("c:" + c);//c also becomes 11



    }
}
