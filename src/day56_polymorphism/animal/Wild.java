package day56_polymorphism.animal;

public class Wild {

    public static void main(String[] args) {

        Lizard lizard1 = new Lizard();
        Reptile lizard2 = new Lizard();
        Animal lizard3 = new Lizard();
        Object lizard4 = new Lizard();  // this one wont have access to eat. just has access to whatever object class can have.
        //all the possible combinations available references for lizard. we have 3 lizard objects  and 0 animal or reptile objects. but the implementation for all the different ones will be available from what is defined in the object side so in the lizard side. it will only print out what the method can do on lizard class.

        lizard1.eat();
        lizard2.eat();
        lizard3.eat();

    }
}
