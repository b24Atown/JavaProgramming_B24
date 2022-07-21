package day41_arraylist;

import java.util.ArrayList;

public class RemoveByObject {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(500);
        nums.add(700);
        nums.add(900);

        nums.remove(0); // how to remove first index

        //this is how you would remove the value 700
        Integer a = 700;
        nums.remove(a);

        //approach 2 by making the object in the remove method

        nums.remove(new Integer(900));



        System.out.println(nums);

    }
}
