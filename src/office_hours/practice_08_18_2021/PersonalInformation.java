package office_hours.practice_08_18_2021;
import java.util.Scanner;
public class PersonalInformation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int pplLiveWith = input.nextInt();
        if(pplLiveWith==2){
            System.out.println("...");
        }

        input.nextLine();

        System.out.println("What city do you live in?");
        String city = input.nextLine();

        System.out.println("Do you live downtown?");
        String livesDowntown = input.next();

        if(livesDowntown.equalsIgnoreCase("yes")){
            System.out.println("have you thought about moving to the suburbs");
        }
    }
}
