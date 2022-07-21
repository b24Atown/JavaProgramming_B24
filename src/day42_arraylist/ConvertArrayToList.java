package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class  ConvertArrayToList {

    public static void main(String[] args) {

        Integer [] a = {1,2,3};

        Arrays.asList(a); //this allows us to convert from array to arrayList

        //converting the 'a' array to ArrayList
        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(a));
        System.out.println(list);

        //creating an array with values right away. this is how we will use it mostly
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4,6,2,5,56,33,67));
        System.out.println(list2);

    }
}
