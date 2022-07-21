package day34_methods;

public class MyFirstMethod {

    public static void helloWorld(){
        System.out.println("Hello World");
    } //we made the method and defined what we wanted to do with it. prints hello world

    public static void helloWorld50Times(){
        for(int i = 0; i<50;i++){
            System.out.println("Hello World");
        }//we made another method here where itll print hello world 50 times. to call it we would use it in the main method and just write helloWorld50Times();
    }


    public static void main(String[] args) {
        helloWorld();//we printed the method

        helloWorld50Times();
    }
}
