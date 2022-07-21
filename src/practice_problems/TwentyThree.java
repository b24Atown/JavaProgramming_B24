package practice_problems;

public class TwentyThree {

    //Write a method that can check if a number is prime or not

    public static void main(String[] args) {
        System.out.println(primeNum(11));
        System.out.println(primeNum(10));
        System.out.println(primeNum(9));
        System.out.println(primeNum(-10));

    }
// 5  2 3 4

    public static String primeNum(int num){
        if(num<=1){
            return num + " is not a prime number";
        }
        boolean check = true;
        for(int i = 2;i<num/2;i++){
            if(num%i==0){
                check = false;
            }
        }
        if(check){
            return num + " is a prime number";
        }
        return num + " is not a prime number";
    }
}
