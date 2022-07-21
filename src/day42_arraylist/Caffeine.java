package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {

    /*
    ArrayList of caffeinated drinks.
    figure out how much caffeine each drink has and store that into a new arraylist
    coffee-80
    tea - 50
    monster - 100
    red bull - 100
    coke - 70
    pepsi - 70
    bang - 100
    apple juice - 0
     */

    public static void main(String[] args) {

        String [] allDrinks = {"coffee","tea","monster","red bull", "coke","pepsi", "bang","apple juice"};

        ArrayList<String> drinkList = new ArrayList<>(Arrays.asList(allDrinks)); //converted array to arraylist with values right away

        ArrayList<Integer> caffeineAmount = new ArrayList<>(); //empty arraylist to add values in later

        for(String eachDrink : drinkList){

            int caffeineNum = 0;

            switch (eachDrink){
                case "coffee":
                    caffeineNum = 80; break;
                case "tea" :
                    caffeineNum = 50; break;
                case "monster":
                case "red bull":
                    case "bang":
                    caffeineNum = 100; break;
                case "coke":
                case "pepsi":
                    caffeineNum = 70; break;
                case "apple juice":
                    caffeineNum = 0; break;

            }
            caffeineAmount.add(caffeineNum);
        }

      //  System.out.println(drinkList);
       // System.out.println(caffeineAmount);

        System.out.println("----------------Caffeine Table ---------------------");

        for(int i = 0; i<drinkList.size();i++){
            System.out.println("Drink: " + drinkList.get(i));
            System.out.println("Caffeine amount: "+ caffeineAmount.get(i));
            System.out.println();
        }


    }
}
