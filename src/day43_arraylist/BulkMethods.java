package day43_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkMethods {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);

        nums.addAll(Arrays.asList(3, 5, 2, 5, 7));

        ArrayList<Integer> other = new ArrayList<>(Arrays.asList(10,20));
       // nums.add(other.get(0));
        //nums.add(other.get(1));

        System.out.println(nums);

        nums.addAll(0,other); // puts values from other in index 0;
        System.out.println(nums);
        System.out.println(other);

        nums.removeAll(Arrays.asList(5)); //removes all the 5s in the arraylist
        System.out.println(nums);



    }
}
