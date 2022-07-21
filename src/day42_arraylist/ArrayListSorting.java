package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListSorting {

    public static void main(String[] args) {

        //we use arrays.sort to sort arrays

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4,50,20,502,150,-40,-10));

        Collections.sort(nums);
        System.out.println(nums);
    }
}
