package practice_problems;

import java.util.ArrayList;
import java.util.Arrays;

public class TwentySeven {
    //ArrayList -- Remove some values
    //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4,5,222,33,432,111,2));
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(4,5,222,33,432,111,2));

        System.out.println(RemoveOver100(nums2));

        System.out.println(RemoveOver1002(nums));
    }



    public static ArrayList<Integer> RemoveOver100(ArrayList<Integer> list){

       for(int i = 0; i<list.size();i++){
           if(list.get(i)>100){
               list.remove(i);
               i--;
           }
       }
       return list;
    }

    public static ArrayList<Integer> RemoveOver1002(ArrayList<Integer> list){
        ArrayList <Integer> result = new ArrayList<>();

        for (int i = 0; i<list.size();i++){
            if(list.get(i)<100){
                result.add(list.get(i));
            }
        }
        return result;
    }
}
