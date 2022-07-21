package practice_problems;


import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Classcs {

    public static void main(String[] args) {

        String [] arr = {"java", "longer word", "civic", "apple","racecar","mom","anna"};
        String longest = "";

        for(String each: arr){
            boolean ispal = true;
            for(int i =0; i<each.length()/2;i++){
                if(each.charAt(i)!= each.charAt(each.length()-1-i)){
                    ispal = false;
                    break;
                }


            }
            if(ispal && each.length()>longest.length()){
                longest= each;
            }
        }
        System.out.println(longest);
    }
}
