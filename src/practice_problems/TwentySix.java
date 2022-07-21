package practice_problems;

import java.util.ArrayList;
import java.util.Arrays;

public class TwentySix {

    //ArrayList -- Remove "Ahmed"
    //Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    //Write a java operation to remove all the names named Ahmed

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ahmed","John","Ahmed","William"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Ahmed","John","Ahmed","William"));
        String a = "Ahmed";
        System.out.println(RemoveObject2(list,a));
        System.out.println(RemoveObject(list2,a));


    }

    public static ArrayList<String> RemoveObject(ArrayList<String> list, String name){
        list.removeAll(Arrays.asList(name));
        return list;
    }

    public static ArrayList<String> RemoveObject2(ArrayList<String> list, String name){
        for (int i = 0; i< list.size();i++){
            if(list.get(i).equals(name)){
                list.remove(name);
                i--;
            }
        }
        return list;
    }
}
