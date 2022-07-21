package day50_inheritance;

public class UsingAnimals {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.age = 10; //just trying to see what we have access to. it has acccess to 3 variables

        Dog dog = new Dog(); // dog has access to 4 variables
        dog.age = 10;
        dog.hasTail = true;

        Lion lion = new Lion(); // lion has access to 5 variables.
        lion.numberOfClaws = 5;
        lion.roar();
        //no logic in here. just trying to see how it behaves.
    }

}


