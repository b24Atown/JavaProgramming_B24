package day46_constructors;

public class MyOffer {

    public static void main(String[] args) {

        Offer first = new Offer("Chase", 150_000,true);
        System.out.println(first);

        Offer second = new Offer("CHicago", "BOA", 155_000,false,15);
        System.out.println(second);
    }
}
