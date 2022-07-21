package day53_inheritence.shapes;

import java.util.zip.DeflaterOutputStream;

public class Circle extends Shape {

    double radius;


    public Circle(double  radius){
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                '}';
    }
}

