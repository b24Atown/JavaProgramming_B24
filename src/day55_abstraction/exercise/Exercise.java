package day55_abstraction.exercise;

public abstract class Exercise {  // abstract class

    public abstract void perform(); // abstract method

    public abstract void getCaloriesBurned(int minutes); //abstract method 2

    //not able to make an object of exercise class.
    // so cant do Exercise person1 = new Exercise.
}
