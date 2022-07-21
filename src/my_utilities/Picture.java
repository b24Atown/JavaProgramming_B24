package my_utilities;

public class Picture {

    public static void main(String[] args) {

        draw(50);
        draw("red");
        draw("bluue","green");
    }

    public static void draw (String color){
        System.out.println("Using 1 color");
    }

    public static void draw(String color1,String color2){
        System.out.println("Usinig 2 colors");
    }

    public static void draw(int size){
        System.out.println("Drawing " + size + " inches picture");
    }
}
