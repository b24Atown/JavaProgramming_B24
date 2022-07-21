package day08_relational_logical_operators;

public class ShorthandOperators {

    public static void main(String[] args) {

        double parkingFee = 7.50;
        System.out.println("you are an early bird so half off");

        // parkingFee = parkingFee / 2; this is the manual way

        // this is the shorthand way. it reassigns and changes it faster
        parkingFee /= 2;
        System.out.println("your fee is: " + parkingFee);

        int tvs = 30;
        //tvs--;
        //tvs--;
        //or shorthand
        tvs -= 2;

        System.out.println(tvs);

        int i = 10;
        i %= 2; // so 10/2 =5. no remaninder therefore i = 0
        System.out.println("i:" +i);



    }
}
