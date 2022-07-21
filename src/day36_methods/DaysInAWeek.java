package day36_methods;


public class DaysInAWeek {

    /*
    make a method that will accept a number
    I want to see which day of the week it is
       1-monday
       7-sunday
     */
    public static void main(String[] args) {
        System.out.println(getDayOfWeek(2));
        System.out.println(getDayOfWeek(1));
        String day = getDayOfWeek(1);
        System.out.println(day.charAt(0));
        String day2 = getDayOfWeek(10);
        System.out.println(day2.equals("Not a valid day"));

        if(getDayOfWeek(6).equals("Saturday")||getDayOfWeek(7).equals("Sunday")){
            System.out.println("Its the weekend");

        }

    }

    public static String getDayOfWeek(int number){ //enter in a number and get day of the week
        String day = "";
        switch (number){
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Not a valid day";

        }
        return day;
    }
}
