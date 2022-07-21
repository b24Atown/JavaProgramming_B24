package day43_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListUnique {

    /*
    Create a method that accepts an ArrayList and return an ArrayList of only unique values
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,4,1,5,1,1,3,6,10));
        System.out.println(getUniqueElements(list));
    }

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
