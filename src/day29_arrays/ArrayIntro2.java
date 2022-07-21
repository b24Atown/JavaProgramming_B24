package day29_arrays;

import java.util.Arrays;

public class ArrayIntro2 {

    public static void main(String[] args) {

        double[] prices = new double[5]; //making an array that will hold 5 values. we dont knoe the information to put inside of it yet but we declared it because we know we will need it. the size of the array will always hold 5 elements since we declared it that way. if we only declare 4 for example, the last one will still be there but just show up as 0.0
        System.out.println(Arrays.toString(prices));

        prices[0] = 25.99; //how we can store the values later
        prices[1] = 50.2;
        prices[2] = 90.5;
        prices[3] = 100.5;
        System.out.println(Arrays.toString(prices));

        prices[2] = 2000.5; //can reassign an array. ex reassigning index 2 of the array
        System.out.println(Arrays.toString(prices));

        prices = new double[2];//this doesnt reassign the prices, we just lose reference to the original array. we created a completely new array. we wouldnt do this just an example. we would have lost reference to the original array.
        System.out.println(Arrays.toString(prices));


    }
}
