package day62_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DatabaseExample {

    public static void main(String[] args) {

        /*
        Person
        first name-james
        last name- bond
        age - 40
         */


        Map<String,String> person1 = new HashMap<>();
        person1.put("FIRST_NAME","James");
        person1.put("LAST_NAME", "Bond");
        person1.put("AGE","40");

        ArrayList<Map<String,String>> allPeople = new ArrayList<>();
        allPeople.add(person1);
        System.out.println(allPeople.get(0)); // getting the first map object
        System.out.println(allPeople); // printing whole arrayList
        System.out.println(allPeople.get(0).get("FIRST_NAME"));//getting value for key
    }
}
