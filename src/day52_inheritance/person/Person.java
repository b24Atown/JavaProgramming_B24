package day52_inheritance.person;

import java.util.ArrayList;

public class Person {

    String name;
    int age;
    int birthYear;
    ArrayList <String> hobbies;

    public void walk(){
        System.out.println(name + " is walking");
    }

    public Person(){

    }

    public Person(String name, int age, int birthYear){
        this.age = age;
        this.name = name;
        this.birthYear=birthYear;
        hobbies = new ArrayList<>();
    }
}
