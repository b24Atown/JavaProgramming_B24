package practice_problems;

public class Practice1 {

    public static void main(String[] args) {

        //write a method that can return the sum of the digits in an integer without using parseInt
        //ex 635
        int ex = 777; // 77
        int sum = 0;
        int temp = ex;


        while (temp>0){

            sum+= temp%10;
            temp/=10;

        }
        System.out.println(sum);

    }

}
