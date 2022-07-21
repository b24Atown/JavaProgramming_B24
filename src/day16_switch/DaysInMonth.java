package day16_switch;

public class DaysInMonth {
    public static void main(String[] args) {

        /*
        Write a program that will accept a month name and output how many days are in that month
        February: 28 days
        April, June, September, November: 31 days
        January March May July August October December: 31 days
         */

        String month = "beyblade";
        int num = 0;

        switch (month){
            case "February" :
                num = 28;
                break;
            case "April" :
            case "June" :
            case "September" :
            case "November " :
                num = 30;
                break;
            case "January" :
            case "March" :
            case "May" :
            case "July" :
            case "August " :
            case "October" :
            case "November" :
                num = 31;
                break;
            default:
                System.out.println("invalid month entered");
        }
        if(num !=0) {
            System.out.println(num + " days");
            //this line was added to make sure that the msg doesnt say invalid month entered 0 days.
            //if its invalid day. month goes to 0 and it will say 0 days.
        }
    }
}
