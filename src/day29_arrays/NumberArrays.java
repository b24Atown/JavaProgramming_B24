package day29_arrays;

import java.util.Arrays;

public class NumberArrays {

    public static void main(String[] args) {

        int [] ages = {10,14,21,80,50,70,30,40,10,};
        //you can put any amount you want in there, you can put duplicates etc.

        System.out.println(ages.length); //9 numbers in arrays hence 9 length
        System.out.println(Arrays.toString(ages)); //this shows all the numbers in the array
        System.out.println(ages[ages.length-2]);//40
        System.out.println(ages[7]);//40 same thing as above thing.


        System.out.println("--------------");
        double[] scores = {90.3,80.13,40.5,19.9,100.0,50};
        System.out.println(scores.length);
        System.out.println(Arrays.toString(scores));

        System.out.println(scores[0]+scores[1]);//you can also do things with the array such as adding them together. so adding 90.3 and 80.13 = 170.43





    }
}
