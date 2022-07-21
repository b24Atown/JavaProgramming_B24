package day41_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        if(list.isEmpty()){
            System.out.println("You should add something to your list");
        }else {
            System.out.println("Your list has some things");
        }

        String keepAsking = "";

        do{
            System.out.println("What do you want to add to your list");
            String item = input.nextLine();
            list.add(item);
            System.out.println("Do you want to add anything else");
            keepAsking = input.nextLine();

        }while (keepAsking.equals("yes"));

        System.out.println("This is your shopping list: " + list);

        System.out.println("Do you want to remove anything?");
        String wantToRemove = input.nextLine();

        if(wantToRemove.equals("yes")){
            System.out.println("What do you want to remove");
            list.remove(input.nextLine());
        }

        System.out.println("This is your shopping list: " + list);
        System.out.println("Shopping list size after removing item: " + list.size());



    }
}
