package day24_loops;

public class DayInWeek {
    public static void main(String[] args) {

        for (int day = 1; day<=7;day++ ){

            switch (day){
                case 1: System.out.println("Monday"); break;
                case 2:
                    System.out.println("Tuesday"); break;
                case 3:
                    System.out.println("Wednesday"); break;
                case 4:
                    System.out.println("Thursday"); break;
                case 5:
                    System.out.println("Friday"); break;
                case 6:
                    System.out.println("Saturday"); break;
                case 7:
                    System.out.println("Sunday"); break;
                    //so runs day 1, finds switch case for day 1 and prints its statement. then increments and runs incremented value. finds case for that and prints it. so itll show monday then tuesday etc...



            }
        }
    }
}
