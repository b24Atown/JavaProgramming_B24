package day45_constructors;

public class  Pen {

    String color;

    public Pen(String str){   //constructor
        System.out.println("Made Pen object " + str);
        color = str;
    }

    public static void main(String[] args) {

        Pen bic = new Pen("red");

        new Pen("blue"); //called the constructor but no reference. wont be able to use this again

        System.out.println(bic.color);

        //old way  Pen bic = new Pen ("");
        //         bic.color = "red";


    }
}
