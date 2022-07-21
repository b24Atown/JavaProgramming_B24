package day54_abstraction.mobile;

public class Instagram extends MobileApp{


    //the variables are not inherited. the public methods are inherited so getters and setters. so we can access them indirectly.

    public void postPhoto(){
        System.out.println("Posting phone");
    }
    // right now we have access to 7 instance methods. so the 4 getters and setters, the useApp method, download method and method here now postPhoto

    @Override
    public void useApp(int minutes){
        super.useApp(minutes);//so far method works the same
        postPhoto(); // now overridden to usephoto method.
    }
    //so used super to call parent method but wanted to chhange so that usephoto method also gets used.

}
