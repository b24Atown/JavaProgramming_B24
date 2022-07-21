package day53_inheritence.shapes;

public class UseShape {

    public static void main(String[] args) {

        Shape shape = new Shape("Shape");
        System.out.println(shape.name);
        System.out.println(shape.area());
        System.out.println(shape.perimeter());

        System.out.println("------------");

        Square square = new Square( 3.3);
        System.out.println(square.name);
        System.out.println(square.area());
        System.out.println(square.perimeter());

        System.out.println("=============");

        Circle circle = new Circle(2.4);
        System.out.println(circle.name);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());


    }
}
