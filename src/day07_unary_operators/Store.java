package day07_unary_operators;

public class Store {

    public static void main(String[] args) {

        String storeName = "Target";
        int numberOfTvs = 100;

        System.out.println("Person came into the store and bought a tv");
        System.out.println("number of tvs now: " + --numberOfTvs);

        System.out.println("person came into the store and bought a tv");
        System.out.println("numbeer of tvs now " + --numberOfTvs);

        System.out.println("person came into the store and put a tv into the cart");
        System.out.println("number of tvs in the store is still" + numberOfTvs--);
        System.out.println("they buy now and leave" + numberOfTvs);

        System.out.println("shipment of tvs comes");
        numberOfTvs = numberOfTvs + 53; //reassigned
        System.out.println(numberOfTvs);

        System.out.println("someone buys 5 tvs");
        numberOfTvs = numberOfTvs - 5;
        System.out.println(numberOfTvs);



    }
}
