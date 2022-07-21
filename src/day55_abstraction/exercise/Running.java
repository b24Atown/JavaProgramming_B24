package day55_abstraction.exercise;

public class Running extends Exercise{ // this is now the concrete class

    @Override
    public void perform(){ // had to override since were in concrete class
        System.out.println("Runnning...");
    }

    @Override
    public void getCaloriesBurned(int minutes){ //same thing as uptop
        System.out.println(minutes * 0.4);
    }
}
