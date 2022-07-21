package day29_arrays;

public class SumOfNumbers {
    public static void main(String[] args) {

        int []  numbers = {4,1,4};

//old way to add numbers
        int sum = 0;
        sum+= numbers[0];
        sum+= numbers[1];
        sum+= numbers[2];

        System.out.println(sum);


        System.out.println("-----------");
        // loop way

        int[] numbers2 = {5,5,2,5,1};
        int sumWithLoop = 0;

        for(int i = 0;i<numbers2.length;i++){
            sumWithLoop+= numbers2[i];

        }
        System.out.println(sumWithLoop);

    }
}
