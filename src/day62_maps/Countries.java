package day62_maps;

import java.util.*;

public class Countries {

    public static void main(String[] args) {

        Map<String, ArrayList<String>> pairs = new HashMap<>();

        pairs.put("North America", new ArrayList<>(Arrays.asList("Chicago","New York","Dallas","Arlington")));
        pairs.put("Europe", new ArrayList<>(Arrays.asList("Paris", "Rome","Berlin","Sivas")));
        pairs.put("Asia", new ArrayList<>(Arrays.asList("Bangkok","Tokyo","Seoul")));

        System.out.println(pairs);

        for(String continent: pairs.keySet()){
            System.out.println("Cities in " + continent + " are " + pairs.get(continent));
        }
        System.out.println("--------print first letter of each city---------");

        for (String continent: pairs.keySet()){// goes through the keys which are continents
            System.out.println("Cities in " + continent);

            for (String city: pairs.get(continent)){// goes through the cities which are each ArrayList value
                System.out.println(city.substring(0,1));
            }
        }
    }
}
