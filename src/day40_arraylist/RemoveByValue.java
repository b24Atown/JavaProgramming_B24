package day40_arraylist;

import java.util.ArrayList;

public class RemoveByValue {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("pen");
        list.add("mouse");
        list.add("mouse");
        list.add("marker");

        System.out.println(list);

        list.remove("mouse");//if you know the word you want to remove. if there is multiple occurrences, removes the first occurrence
        boolean removed = list.remove("mouse");
        System.out.println(removed);//overloaded so you can show true if it removes it.

        System.out.println(list);

        boolean removed2 = list.remove("hat");//since its false, iit doesnt do anythinig so when you print it just says false and list is still the same.
        System.out.println(removed2);
        System.out.println(list);



    }
}
