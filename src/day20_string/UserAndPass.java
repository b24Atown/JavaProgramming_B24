package day20_string;

public class UserAndPass {
    public static void main(String[] args) {

        /*
        Given a username and password verify they are valid. The password cannot be less than 5 characters.
        If it is less print: "Password cannot be less than 5 characters"/ If it is more than or equal to 5 print: "Valid password"
        Also the password should not contain the username- if the password has the username in it print : "Invalid password, username should not be in it"
        Also change the password to have the value: "password"
         */

        String username = "howdy";
        String password = "password";

        if (password.length() >=5 && !password.contains(username)){
            System.out.println("Valid password");
        }else {
            System.out.println("Invalid Password");
           if (password.length() <5) {
               System.out.println("Password cannot be less than 5 characters");
        }
           if (password.contains(username)){
               System.out.println("Password cannot contain the username");
           }

        }

    }
}
