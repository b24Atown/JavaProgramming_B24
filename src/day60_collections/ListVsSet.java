package day60_collections;

import java.util.ArrayList;
import java.util.HashSet;

public class ListVsSet {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add(null);
        System.out.println(list); // this is sorted

        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("c");
        set.add(null);
        System.out.println(set); // its not sorted. you can use set if you need to have a list of unique values. set.get(1) not possible since its not ordered so cant  use that method.
        for (String each: set){
            System.out.println(each);
        }
       HashSet<String> set2 = new HashSet<>(list); //convert the list to set
        System.out.println(set2);
    }
}
