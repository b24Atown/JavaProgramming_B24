package day60_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListObjects {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        System.out.println(list);
        System.out.println(list.get(2)); //arr[2] its quick

        List <String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("c");
        System.out.println(linkedList);
        System.out.println(linkedList.get(2));//this needs to look at its neighbors references as well so slower.

        List<String> vector = new Vector<>();
        vector.add("a");
        vector.add("b");
        vector.add("c");
        vector.add("c");
        System.out.println(vector);





    }
}
