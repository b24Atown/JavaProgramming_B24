package day21_loops;

public class Email {
    public static void main(String[] args) {

        String email = "saim@cybertekschool.com";

        int positionOfAt = email.indexOf("@");

        String name = email.substring(0,positionOfAt);
        String domain = email.substring(positionOfAt+1);
        System.out.println("name: " + name);
        System.out.println("domain: " + domain);
    }
}
