package day29_arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        //manual/old way to have a lot of information

        String city1 = "San Francisco";
        String city2 = "Moscow";
        String city3 = "Madison";
        String city4 = "Tokyo";
        String city5 = "Baghdad";

        String [] cities = {"San Francisco", "Moscow", "Madison", "Tokyo", "Baghdad" };
        //                          0           1           2        3          4
        //Element is each peace of information in the array. ex moscow. This is a string array and it holds string elements. The array size cannot be changed. Its always fixed.

        //how do you read each individual city/ element. They have index numbers so each element in the array has a index number/position

        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);

        //how do we know the number of elements
        System.out.println(cities.length); //5.
        // how can we print the whole array at one time
        System.out.println(cities);
        //arrays are objects and gets made in the heap. if you print this, it will just point to the area in the heap where it is stored.

        System.out.println(Arrays.toString(cities));//correct way to get the information from the array

    }
}
