package practice_problems;

import day53_inheritence.rules.C;

public class Seven {

    public static void main(String[] args) {

//        Q7:String -- Password Validation Task
//1. Write a return method that can verify if a password is valid or not.
//requirements:
//
// 1. Password MUST be at least have 6 characters and should not contain space
//2. PassWord should at least contain one upper case letter
//3. PassWord should at least contain one lowercase letter
//4. Password should at least contain one special characters
//5. Password should at least contain a digit
//
//if all requirements above are met, the method returns true, otherwise returns  false
        System.out.println(isValidPassword("Helloworld1"));
        System.out.println(isValidPassword("hellowoWld123!"));

    }

    public static boolean isValidPassword(String password){
        String specialCharacters = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        boolean finalAnswer = false;
        boolean lowerCase = false;
        boolean upperCase = false;
        boolean specialLetter = false;
        boolean hasDigit = false;

        for(int i = 0; i<password.length(); i++){
            if (Character.isUpperCase(password.charAt(i))){
                upperCase = true;
            }
            if (Character.isLowerCase(password.charAt(i))){
                lowerCase = true;
            }
            if(Character.isDigit(password.charAt(i))){
                hasDigit = true;
            }
            //if(specialCharacters.contains(password.charAt(i) + "")) {
            if(!Character.isDigit(password.charAt(i))&&!Character.isAlphabetic(password.charAt(i))){
                specialLetter = true;
            }

        }

        if (password.length() >=6 && !password.contains(" ") ){
            if (lowerCase && upperCase && hasDigit && specialLetter){
                finalAnswer = true;
            }

        }
        return finalAnswer;
    }
}
