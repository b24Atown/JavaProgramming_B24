package day52_inheritance.computer;

public class Lab {

    public static void main(String[] args) {

        Windows computerOne = new Windows("Windows",500);
        Windows computerTwo = new Windows("Windows",1000);

// three and four is better way to do it.(check constructors in their classes)
        Mac computerThree = new Mac(500);
        Mac computerFour = new Mac(500);
        System.out.println(computerThree.os);
        System.out.println(computerThree.memory);
        System.out.println(computerFour);

    }
}
