package day53_inheritence.shapes;

public class Square extends Shape{

    double side;

    public Square(double side){
        super("Square");// im setting up name to be square
        this.side = side;
    }

    @Override
    public double area(){

        return side * side;
    }

    @Override
    public double perimeter(){
        return side *4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", side=" + side +
                '}';
    }
}
