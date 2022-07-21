package day40_arraylist;

import java.util.ArrayList;

public class Classroom {

    public static void main(String[] args) {

        ArrayList<String> groupOne = new ArrayList<>();
        System.out.println(groupOne);

        groupOne.add("Vindar");
        groupOne.add("James Bond");
        groupOne.add("Tach");
        groupOne.add("Topcu");
        System.out.println(groupOne);
        System.out.println("First element: "+groupOne.get(0));
        System.out.println("Third element: "+ groupOne.get(2));

        System.out.println("First element, first char:" + groupOne.get(0).charAt(0));
        System.out.println("-------------");


        ArrayList<String> groupTwo = new ArrayList<>();
        groupTwo.add("Nisso");
        groupTwo.add(0,"Omer");//We can choose index where to put new element
        groupTwo.add("Kamila");
        groupTwo.add(0,"Bogdan");
        groupOne.add(1,"james");
        System.out.println(groupTwo);

        //1st [Nisso}
        //2nd [omer,nisso]
        //3rd [omer,nisso,kamila]
        //4th [bogdan,omer,nisso,kamila]
        //5th [ bogdan,james,omer,niisso,kamila]
    }
}
