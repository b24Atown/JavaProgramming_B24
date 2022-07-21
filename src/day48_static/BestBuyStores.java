package day48_static;


import day04_variables.Store;

public class BestBuyStores {

    public static void main(String[] args) {

        BestBuy storeOne = new BestBuy("Main St");

        BestBuy storeTwo = new BestBuy("Oak Drive");

        System.out.println(storeOne.location);
        System.out.println(storeTwo.location);//this is instance so its called from object. you cant do this sout(BestBuy.location).

        System.out.println(BestBuy.day);//how to access day, its static so its called from class leve. Another point to keep in mind since it belongs to class, all objects share the same information.
        System.out.println(storeOne.day);
        System.out.println(storeTwo.day);

        BestBuy.day = "Sunday"; //reassigning string. can also change day varialbe by doing storeOne.day = "Sunday". but not way to do it.

        System.out.println(BestBuy.day);
        System.out.println(storeOne.day);
        System.out.println(storeTwo.day);
        //they will all show changed information.

    }

}
