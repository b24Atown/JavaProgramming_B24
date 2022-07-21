package practice_problems;

public class Eight {

    public static void main(String[] args) {

        System.out.println(sumOfDigits("1AB24CF3B33"));

    }

    //Q8:String -- sum of digits in a string
    //Write a method that can return the sum of the digits in a string


    public static int sumOfDigits (String str){

        int sum = 0;

        for(int i = 0; i<str.length();i++){

            if(Character.isDigit(str.charAt(i))){
                int a = Integer.parseInt(str.charAt(i) + "");
                sum += a;
            }
        }
        return sum;
    }
}
