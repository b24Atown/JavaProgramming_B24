package day16_switch;

public class SeasonFinder {
    public static void main(String[] args) {

        /*
        given some month number determine which season it is
        Winter 12,1,2
        spring 3,4,5
        summer 6,7,8
        fall 9,10,11
        ex:
        when month = 2;
        output winter
        when month = 7,
        output summer
         */

        int num = 33;
        String season = "";

        switch (num){
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Fall";
                break;
            default:
                System.out.println("Invalid month");
        }
        if (num>=1 && num<=12) {
            System.out.println(season + " is the season");
        }




    }
}
