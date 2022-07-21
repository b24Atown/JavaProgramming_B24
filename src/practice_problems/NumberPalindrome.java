package practice_problems;

public class NumberPalindrome {

    public static void main(String[] args) {

        //the first thing we wanna do is create a copy of the number so we can manipulate it. We wanna also declare some other int variables that will check for the remainder and reversed number. Now were gonna make a while loop running while the temporary number which is being manipulated is bigger than 0. Inside the loop we will check for remainder first. we do that by doing the temp number and doing %10. this takes that last value and stores it into remainder container. Since we got  the remainder we also wanna show the temp value result now by dividing by 10. then that remainder value we wanna do rev*10 + rem.
        int num = 1221;
        int temp = num;
        int rev = 0;
        int rem = 0;
        while(temp>0){
            rem = temp%10;
            temp /=10;
            rev = rev*10 + rem;

        }
        if(rev == num){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        //2nd way to do it.  We wanna take the number and turn int to string. then make a variable that will hold reversed value. loop through the string backwards now and concantenate it to the reversed container. now we wanna take that string and turn it into a number again. from there we can check if the numbers are equal to each other or not.

        String a = Integer.toString(num);
        String reverse = "";
        for(int i = a.length()-1; i>=0;i--){
            reverse+= a.charAt(i);
        }
        System.out.println("String num value " + reverse);
        int b = Integer.parseInt( reverse);
        System.out.println("int num value " + b);


    }
}
