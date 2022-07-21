package day09_scanner_logical;

public class PractsieQs {

    public static void main(String[] args) {

        /* create a class called KgTopounds, and write a program that can convert Kg to pound and print the result
        Ex:kg = 10;output:10 kg equal to 22.0462 poundskg = 20output:20 kg equal to 44.0924 pounds....
        Hint: 1kg = 2.20462 pounds
         */

        double weight1 = 10;
        double weight2 = 20;

        double convertKg = 2.20462;
        double conversion = weight1 * convertKg;
        double conversion2 = weight2 * convertKg;

        System.out.println("10 kg = " + conversion + " lbs");
        System.out.println("20 kg = " + conversion2 + " lbs");

        int x = 2 + 3 * 2 / 1; //2+6...8
        System.out.println("x:" + x);

        int y = ( 2 + 3 ) * 2;//5*2..10
        System.out.println("y:" + y);

        int w = 78 / 2 * 2 + 3 - 5 % 5; //78 + 3 - 0...81
        System.out.println("w:" + w);

        int i = 8 + 2 + 3 + 5 - 2 - 1- 0 + 1 * 2; // 15+2..17
        System.out.println("i:" + i);

       // int a = 8;int b = a--;
       // System.out.println("a:" +a);//7
        //System.out.println("b:" +b);//8

        int a =1; //-1
        int b = -a-- + a++ / -a-- * --a;
        System.out.println("a:" +a);// -1
        System.out.println("b:" +b);//-1 + 0 / -1 * -1 = -1

        int A = 50;
        int B = --A + A++ + A-- + A++;
        System.out.println("A:" +A); //50
        System.out.println("B:" +B);//+49 + 49 + 50 + 49...197

        int X = 4;
        int Y = X * 4 - X++;
        System.out.println("X:" +X);//5
        System.out.println("Y:" +Y);//4*4-4=12

        int t = 100;
        int p = - ++t * -t-- / t++ + --t;
        System.out.println("t" +t);//100
        System.out.println("p" +p);// -101 * -101 / 100 + 100...202










    }
}
