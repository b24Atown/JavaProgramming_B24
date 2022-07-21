package day44_custom_classes;

public class Animal {

    String species;
    String size;
    int numberOfLegs;
    boolean canFly;
    boolean isMammal;
    double weight;
    double lifeSpan;

    //methods

    //no static means these are instance methods. (method that only belongs to each object) so like everytime we use (new)
    public void eat(){
        System.out.println(species + " is eating");

    }

    public void sleeping(){
        System.out.println("This " + size + " animal is sleeping");
    }
}
