package day55_abstraction.animal;

public class Dog extends Animal implements IsFriendly {
    @Override
    public void eat() {

    }

    @Override
    public void pet() {

    }

    @Override
    public void play() {

    }
    //could have also done  public class Dog extends Animal implements  petable,playable
}
