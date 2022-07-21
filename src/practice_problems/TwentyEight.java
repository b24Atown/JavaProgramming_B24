package practice_problems;

import java.util.ArrayList;
import java.util.Arrays;

public class TwentyEight {

    // ArrayList -- sorting in ascending: Write a method that can sort the ArrayList in Ascending order without using the sort method

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,4,2,5,6,2,33,1,3));
        System.out.println(sortArrayList(list));
    }

    public static ArrayList<Integer> sortArrayList(ArrayList<Integer> list){

        int [] arr = new int[list.size()];
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i<arr.length;i++){
            arr[i] =  list.get(i);
        }


        for (int i = 0; i<list.size();i++){

            for (int j = 0; j<list.size(); j++) {
                if (arr[i]<arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        for (int i = 0; i<arr.length;i++){
            list2.add(arr[i]);
        }
return list2;
    }
}
