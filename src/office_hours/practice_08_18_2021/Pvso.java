package office_hours.practice_08_18_2021;

import java.util.Arrays;

public class Pvso {

    public static void main(String[] args) {

        String[] arr = {"zero", "one", "two","three","four"};
        String container = "";

        for(int i = 0;i<arr.length;i++){
            if(arr[i].contains("e")){
                container+=arr[i] + " ";
            }
        }
        String [] newArr = container.split(" ");

        System.out.println(Arrays.toString(newArr));



    }
}
