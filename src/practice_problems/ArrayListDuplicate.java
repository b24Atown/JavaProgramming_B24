package practice_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDuplicate {

    //► Write a method returns count of duplicate numbers in a list(Like 1,2,3,4,2,1->2)

    public static ArrayList<Integer> duplicatesInList (ArrayList<Integer> list){
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer each: list){
            int count =   0;
            for (int i =0; i<list.size();i++){
                if(list.get(i)==each){
                    count++;
                }
            }

            if (count>1 && !result.contains(each)){
                result.add(each);

            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,2,1));
        System.out.println(duplicatesInList(nums));
    }
}
