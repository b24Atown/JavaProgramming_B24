package day58_exceptions.animal;

public class Animal {
    public Animal getAnimal(){ //we made a method called getanimal and it retuns Animal type. made return method return null just to mkae it work.
        return new Animal();
    }
    //Covarian rule. in animal class, we can have return type itself or any subclass. so in this case return  type can be animal or panda or po. in Panda class return  type can be panda or Po, in po class it can only be po.
}
