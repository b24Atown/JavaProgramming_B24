package day54_abstraction.hiding;

public class Person {

    String name  = "James Bond";
}

class Baby extends Person{
    String name = "Mike Smith";//by creating another name variable in the sub class, we hide the name from the parent. so when we print it in runner class  it will show mike smith. if we didnt do thihs the same  name  would show  up (James bond).
}

class Runner{
    public static void main(String[] args) {
        Person person  = new Person();
        System.out.println(person.name);

        Baby baby = new Baby();
        System.out.println(baby.name);
    }
}