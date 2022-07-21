package day54_abstraction.abstract_class;

public abstract class ElectricCar extends Car{
    //just showing we can have an abstract class be a child class and if we make that one abstract as well, we dont have to implement the start method in here. so this class isnt concrete because its not abstract.
    public abstract void charge();
}
