package day49_encapsulation;

public class Shape {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(-10,-20);

//        System.out.println(rectangle1.height);  // cant do this anymore since we made them encapsualted.
//        System.out.println(rectangle1.width);

        System.out.println(rectangle1.getWidth());
        System.out.println(rectangle1.getHeight());
        //lines will show 0 since we entered invalid data from how we setup the methods
        rectangle1.setWidth(10);
        rectangle1.setHeight(20);

        System.out.println(rectangle1.getHeight());
        System.out.println(rectangle1.getWidth());
        System.out.println(rectangle1.calculateArea());


    }
}
