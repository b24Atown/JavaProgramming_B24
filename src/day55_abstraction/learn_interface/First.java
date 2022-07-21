package day55_abstraction.learn_interface;

public interface First { //abstract. not considered a class

    public abstract void write(); //whenever you make a method in interface, by default its already public abstract so it shows up as grey here.

    void read(); // same as uptop.

}

class Book implements First{ //here we made a class to use abstraction. need to use keyword implements.


    @Override
   public void read(){

    }

    @Override
    public void write(){

    }



}
