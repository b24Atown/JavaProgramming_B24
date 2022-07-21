package day62_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClasses {

    public static void main(String[] args) {

        Map<Integer,String> map1 = new HashMap<>();
        map1.put(2,"two");
        map1.put(4,"four");
        map1.put(1,"one");
        map1.put(5,"five");
        map1.put(3,"three");
        System.out.println("HashMap: "+ map1);

        Map<Integer,String> map2 = new LinkedHashMap<>();
        map2.put(2,"two");
        map2.put(4,"four");
        map2.put(1,"one");
        map2.put(5,"five");
        map2.put(3,"three");
        System.out.println("LinkedHashMap: " + map2);

        Map<Integer,String> map3 = new TreeMap<>();
        map3.put(2,"two");
        map3.put(4,"four");
        map3.put(1,"one");
        map3.put(5,"five");
        map3.put(3,"three");
        System.out.println("TreeMap: "+map3);


        Map<String,String> map4 = new HashMap<>();//order not guaranteed
        map4.put("apple","juice");
        map4.put("water", "pool");
        map4.put("computer", "chip");
        map4.put("Zebra", "Zoo");
        map4.put("Class", "java");


        Map<String,String> map5 = new TreeMap<>();//sorting
        map5.put("apple","juice");
        map5.put("water", "pool");
        map5.put("computer", "chip");
        map5.put("Zebra", "Zoo");
        map5.put("Class", "java");

        Map<String,String> map6 = new LinkedHashMap<>();//same as entry.
        map6.put("apple","juice");
        map6.put("water", "pool");
        map6.put("computer", "chip");
        map6.put("Zebra", "Zoo");
        map6.put("Class", "java");
        System.out.println(map6);

        System.out.println("String Keyed HashMap: " + map4);
        System.out.println("String Keyed TreeMap: " + map5);
        System.out.println("String Keyed LinkedHashMap: " + map6);

    }
}
