package day09_scanner_logical;

public class EligibleToVote {

    public static void main(String[] args) {

        boolean isUSCitizen = true;
        int age = 30;
        boolean isFelon = false;

        boolean isEligible = age >= 18 && isUSCitizen && !isFelon;
        System.out.println("Eligible to vote: " + isEligible);


    }
}
