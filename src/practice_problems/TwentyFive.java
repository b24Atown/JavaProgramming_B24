package practice_problems;

public class TwentyFive {
    //Reverse negative number
    //Write a return method that can reverse negative number and return it as int
    //-23>>>-32
    //23>>32

    public static void main(String[] args) {

        System.out.println(reversedNum(-49));
        System.out.println(reversedNum(49));
    }

    public static int reversedNum(int num) {
        int temp = num;
        int rem = 0;
        int rev = 0;

        if(temp<0){
            temp = -temp; // number here becomes positive

            while (temp>0){
                rem = temp%10;
                temp/=10;
                rev = rev*10 + rem;
            }
            return -rev; //return negative
        }

        while (temp>0){
            rem = temp%10;
            temp/=10;
            rev = rev*10 + rem;
        }
        return rev;

    }
}
