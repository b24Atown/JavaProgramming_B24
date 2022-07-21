package my_utilities;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListUtil {

    //Accepts an ArrayList and returns an ArrayList of only unique values

    public static ArrayList<Integer> getUniqueElements (ArrayList<Integer> list){

        ArrayList<Integer> unique = new ArrayList<>();

        for(int each: list){
            int count = Collections.frequency(list,each);
            if(count==1){
                unique.add(each);
            }

        }
        return unique;
    }
}
