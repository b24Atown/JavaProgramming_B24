package day60_collections;

import day53_inheritence.rules.A;

import java.util.*;

public class Convert {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4,3,1,4,3,1,4,5,6,2,1,3));
        //remove duplicate values
        System.out.println(nums);

        HashSet<Integer> unique = new HashSet<>(nums);
        System.out.println(unique);

        Set<String> obj = new HashSet<>();
        obj.add(null);
        obj.add("hello");
        obj.add("$4.0");
        obj.add("100");
        obj.add("hello");
        obj.add("%");
        System.out.println("Original: " + obj);//no second hello
        List<String> newList = new ArrayList<>(obj);
        newList.add("hello");
        newList.get(0);
        System.out.println("New: " + newList);
    }
}
