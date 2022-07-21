package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListFrequency {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5,2,5,1,4,5,1,5));

        //find out how many 5 elements are in your ArrayList

        System.out.println(Collections.frequency(nums,5));

        int hi = Collections.frequency(nums,1);
        System.out.println(hi);



        System.out.println(appendPosSum(nums));




    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){
        ArrayList<Integer> nums = new ArrayList<>();



        for(int i = 0; i<list.size();i++){
            if(list.get(i)>0){
                nums.add(i);
            }

        }
        return nums;
    }

}
