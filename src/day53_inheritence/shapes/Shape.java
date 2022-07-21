package day53_inheritence.shapes;


public class Shape {

    String name;

    public double area(){
        System.out.println("Generic Shape");
        return 0.0;
    }

    public double perimeter(){
        System.out.println("Generic Shape");
        return 0.0;
    }

    public Shape(String name){
        this.name = name;
    }
}
