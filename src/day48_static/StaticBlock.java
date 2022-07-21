package day48_static;

public class StaticBlock {

    public StaticBlock(){
        System.out.println("1");
    }

    static {
        System.out.println("2");
    }

    static {
        System.out.println("3");
    }

    public static void main(String[] args) {

        new StaticBlock();


    }
    //static block runs first before anything else and top to bottom. We didnt store a variable just wanted to call it as an example.

}
