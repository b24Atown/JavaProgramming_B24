package day08_relational_logical_operators;

public class OperatorsPractise {

    public static void main(String[] args) {

        int w = 78 / 2* 2 + 3 - 5 % 5;
        //39 * 2 + 3 - 5 % 5
        // 78 + 3 - 5 % 5
        //78 + 3 - 0
        // 81 - 0
        //81
        System.out.println("w:" + w + "\n");

        int c = 1;
        int d = -c-- + c++ / -c-- * --c;
        //int d = -1 (new value of c is 0 now) + c++ / -c-- * --c;
        //int d = -1 + 0 (new value of c is 1) / -c-- * --c;
        //int d = -1 + 0 / -1 (new value of c is 0) * --c;
        // int d = -1 + 0 / -1 * -1     last value of c is -1 so thats what will print
        // int d = -1 + 0 * -1
        //int d = -1

        System.out.println("c:" + c);
        System.out.println("d:" + d);
        System.out.println();

        int t = 100; //t=100 , 101 , 100 , 101 , 100
        int p = - ++t * -t-- / t++ + --t;
        //int p = -101 * -101 / 100 + 100;
        //int p = 10201 / 100 + 100
        // 102 + 100
        // 202

        //int p = - ++t * -t-- / t++ + --t;    ///the signs before the number such as -++t gets put after the incrementation
        //intp = -101(t value is 101) * -t-- / t++ + --t;
        // intp = -101 * -101 (value of t now 100) / t++ + --t;
        //intp = -101 * -101 / 100 (new value of t is 101) + --t;
        //intp = -101 * -101 / 100 + 100
        System.out.println("t:" + t);
        System.out.println("p:" +p);
        System.out.println();


        int R = 20;
        int W = -R-- + -R++ + --R * R-- % 2;
        //int W = -20 (19 ne value of R) + -R++ + --R * R-- % 2;
        //int W = -20 - 19 (new value of R is 20) + --R * R-- % 2;
        //int W = -20  + -19 + +19 (value of R is now 19) * RR-- % 2;
        //int W = -20 + -19 + 19 * 19 (new value of R is 18) % 2;    so last line will show r value as 18
        //intW = -20 -19 + 19 * 19 % 2
        // int W = -20 - 19 + 361 % 2   ....361%2 = 361/2 = 180.5. so we know we can do 180*2 =360. that means remainder 1
        //int W = -20 - 19 + 1
        // intW = -38

        System.out.println("R:" + R);
        System.out.println("W:" + W);




    }
}
