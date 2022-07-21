package day41_arraylist;

import java.util.ArrayList;

public class SetMethods {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(500);
        nums.add(700);
        nums.add(900);
        System.out.println(nums);

        //how to change a value/element
        //arr[index] = value

        nums.set(0,1000);  //takes first element and changes it to that value
        nums.set(3,-2000);

        System.out.println(nums);

        System.out.println(nums.set(1,300)); // will print value that was in position one. but also does the action of changing it to 300. next line when we print nums, itll show tht it's now 300 in index 1.
        System.out.println(nums);

        int i1 = nums.set(0,200);
        System.out.println(i1);
        System.out.println(nums);

    }
}
