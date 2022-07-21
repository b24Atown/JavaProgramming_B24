package day06_arithmetic_operators;

public class Pizza {

    public static void main(String[] args) {

        String type = "cheese";
        byte slices = 8;
        int people = 4;

        int slicesPerPerson = slices / people;

        System.out.println("We ordered " + type + "pizza and had " + slicesPerPerson + " per person");

    }
}
