package day62_maps;

import java.util.HashMap;

public class MapPractice1 {

    public static void main(String[] args) {
        //      key      value
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Leo");
        map.put(2,"Syeda");
        map.put(3,"Guney");
        System.out.println(map);
        String name = map.get(2); // this is NOT index 2, it is key 2
        System.out.println(name);
        map.put(1,"Fuat"); //it will update leo to fuat. doesnt add a new key
        System.out.println(map);

    }
}
