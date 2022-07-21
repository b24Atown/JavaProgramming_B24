package day44_custom_classes;

public class Wild {

    public static void main(String[] args) {

        Animal tiger = new Animal();//object of animal class
        tiger.species = "Tiger";
        tiger.size = "Medium";
        tiger.numberOfLegs = 4;

        tiger.eat();
        tiger.sleeping();

        Animal panda = new Animal();//object of animal class
        panda.eat(); // species isnt defined yet so it will show as null is eating.
        panda.species = "Panda"; // were assigning species to panda here.
        panda.eat();

    }
}
