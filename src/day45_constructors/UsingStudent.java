package day45_constructors;

public class UsingStudent {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "James Bond";
        student1.batchNumber = 7;
        student1.grade = 90;

        System.out.println(student1); //toString method is automatically called
        System.out.println();
        System.out.println(student1.toString()); // same thing as doing this but not neccessary.
    }
}
