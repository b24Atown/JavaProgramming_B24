package day43_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDays {

    /*
    create a method that will return an AraryList with all the days
    Monday, Tuesday...Sunday
    Overrload the method so it accepts the int number= which day of the week they want String

    Input: 1
    Output: Monday

     */

    public static ArrayList<String> getDays (){
        String [] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        ArrayList<String> daysInList = new ArrayList<>(Arrays.asList(days));
        return daysInList;
    }

    public static String getDays (int day){
        String [] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        ArrayList<String> daysInList = new ArrayList<>(Arrays.asList(days));

        return daysInList.get(day -1);


    }

    public static void main(String[] args) {

        System.out.println(getDays());
        System.out.println(getDays(1));

        ArrayList<String> days = getDays();

        //original way to do it. days.contains("Monday") && days.contains("Friday")...
        System.out.println(days.containsAll(Arrays.asList("Monday", "Friday","Sunday")));
        System.out.println(days.containsAll(Arrays.asList("Monday", "April","Sunday")));

    }
}
