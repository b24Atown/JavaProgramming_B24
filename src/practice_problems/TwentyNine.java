package practice_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwentyNine {

    //ArrayList -- sorting in descending order:  Write a method that can sort the ArrayList in descending order without using the sort method

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,4,2,5,6,2,33,1,3));

        System.out.println(sortDescendingList(list));

    }

    public static ArrayList<Integer> sortDescendingList(ArrayList<Integer> list){

        for (int i = 0; i<list.size();i++){
            for (int j = 0; j<list.size();j++){
                if(list.get(i)>list.get(j)){
                    int temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
        return list;
    }
}
