package office_hours.practice_10_12_2021;

import day53_inheritence.rules.A;

import java.util.ArrayList;

public class Store {

    public static void main(String[] args) {

        //All possible references of a TShirt object
        Tshirt shirt1 = new Tshirt();
        Clothes shirt2 = new Tshirt();

        shirt1.wear();

        shirt2.wear();

        //All possible referenes of Tshirt Object
        Jacket jacket1 = new Jacket();
        Clothes jacket2 = new Jacket();
        HasHood jacket3 = new Jacket();

        jacket1.putOnHood();
        jacket1.wear();

        jacket2.wear();
        Jacket jacket2_5 = (Jacket)jacket2;
        jacket2_5.putOnHood();


        jacket3.putOnHood();
        Jacket jacket3_5 = (Jacket) jacket3;
        jacket3_5.wear();

        ArrayList<Clothes> list = new ArrayList<>();
        list.add(shirt1);
        list.add(shirt2);
        list.add(jacket1);
        list.add(jacket2);
        list.add(jacket2_5); //etc

        System.out.println("---");
        for (Clothes each: list){
            each.wear();
        }

    }
}
