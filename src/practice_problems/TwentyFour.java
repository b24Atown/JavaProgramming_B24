package practice_problems;

public class TwentyFour {

    //Armstrong numbers
    //Write a method that can check if a number is Armstrong  number
    // An Armstrong number is a number such that the sum
    // of its digits raised to the third power is equal to the number
    // itself.  For example, 371 is an Armstrong number, since
    // 3**3 + 7**3 + 1**3 = 371.

    public static void main(String[] args) {
        int num = 371;
        System.out.println(armstrongNum(num));
    }

    public static String armstrongNum(int num){
        int temp = num;
        int rem = 0;
        int sum = 0;

        while (temp>0){
            rem = temp%10;
            temp = temp/10;
            sum += Math.pow(rem,3);
        }
        if(sum==num){
            return num + " is an armstrong number";
        }else{
            return num + " is not an armstrong number";
        }

    }
}
