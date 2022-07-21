package day45_constructors;

public class Store {

    public static void main(String[] args) {

        Carpet carpet = new Carpet(10,4,0.5,false);
        System.out.println(carpet);

        Carpet carpet2 = new Carpet(3,3,3,true);
        System.out.println(carpet2);
    }
}
