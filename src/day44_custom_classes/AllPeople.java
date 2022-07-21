package day44_custom_classes;

public class AllPeople {

    public static void main(String[] args) {

        //make Person object
        //we need to call the class person and then make a name for it. so the line below Person is class name, person1 is the instance(or  object). so we made an object of person class and the instance is person1.

        Person person1 = new Person ();
        person1.name = "James Bond";
        person1.age = 40;
        person1.hairColor = "Black";
        person1.sex = 'M';
        person1.isMarried = false;

        System.out.println(person1);//this wont print anything useful for now.


//how to print each field.
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.hairColor);
        System.out.println(person1.sex);
        System.out.println(person1.isMarried);



    }

}
