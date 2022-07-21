package day36_methods;

public class VoidVsReturn {

    public static void main(String[] args) {
        sayHello();
        // String s = sayHello();  cant do this
       // System.out.println(sayHello()); also cant do this

        sayBye();//doestn do anything since it has a return type so you need to store it into a variable and print the variable or print sayBye

        String bye = sayBye();
        System.out.println(bye);
        System.out.println(sayBye());
    }

    public static void sayHello(){
        System.out.println("Hello World");
    }

    public static String sayBye(){
        return "Bye World";
    }
}
