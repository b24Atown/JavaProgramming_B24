package day56_polymorphism.learn_interface;

public class Speech implements CanTalk {

    @Override
    public void speak() {
        System.out.println("Speaking");
    }
}

class Runner {

    public static void main(String[] args) {

        Speech obj = new Speech();
        obj.speak();
        obj.whisper();
        //obj.yell(); not inherited. static methods dont get inherited in interface.
        CanTalk.yell();//this way you can do it. need to call it from  can talk class since it was implemented there.
       // CanTalk.whisper(); whisper is instance method so cant call it from class.

    }

}
