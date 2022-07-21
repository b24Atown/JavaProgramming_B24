package practice_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 44, 1, 100, 55};
        int[] newArr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            newArr[i] = nums[nums.length - 1 - i];

        }
        System.out.println(Arrays.toString(newArr));

        //2nd way

        Integer[] nums2 = {4, 3, 2, 44, 1, 100, 55};
        ArrayList<Integer> newb = new ArrayList<>(Arrays.asList(nums2));
        Collections.reverse(newb);
        System.out.println(newb);

        // without needing to store original list
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 5, 2, 34, 5));
        Collections.reverse(list);
        System.out.println(list);

        String[] words = {"hello", "how", "are", "you", "doing"};
        String reverse = "";

        for (int i = 0; i < words.length; i++) {
            String result = "";
            for (int j = words[i].length() - 1; j >= 0; j--) {
                result += words[i].charAt(j) ;
            }
            reverse+=result + " ";

        }
        System.out.println(reverse);
    }
}
