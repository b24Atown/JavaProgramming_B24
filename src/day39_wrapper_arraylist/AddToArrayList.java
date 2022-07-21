package day39_wrapper_arraylist;

import java.util.ArrayList;

public class AddToArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(50);  //add will put the element to the end, unless arraylist is empty then its in first place
        System.out.println(numbers);

        numbers.add(-1);
        numbers.add(9);
        System.out.println(numbers.add(400));//add method also returns true
        System.out.println(numbers);

        System.out.println(numbers.size());//how to get size of arraylist

        //reading first element from array: arr[0]

        System.out.println("First element " + numbers.get(0));//how to get element
        System.out.println("Last element " + numbers.get(numbers.size()-1));


    }
}
