package day43_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Recap {

    public static void main(String[] args) {

        //first arrayList is made and its empty. then we added data to it
        ArrayList<String> first = new ArrayList<>();
        first.add("water");
        first.add("items");
        first.add("run");
        //second arrayList we made it that was a copy of the first. we also added a new element just to show it's a different list.
        ArrayList<String> second = new ArrayList<>(first);
        second.add("pen");

        System.out.println(first);
        System.out.println(second);
        //made a newe arrayList and the .asList method allows us to make an arrayList with values.
        ArrayList <String> third = new ArrayList<>(Arrays.asList("one","two"));
        System.out.println(third);

    }
}
