package office_hours.practice_08_18_2021;

import java.util.Arrays;
import java.util.Scanner;

public class Pracasd {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

            //TODO: write your code below
            int lastNum = nums.length - 1;

            for (int i = 0; i < nums.length / 2; i++, lastNum--) {

                int temp = nums[i];
                nums[i] = nums[lastNum];
                nums[lastNum] = temp;

            }


            //Do not change below statement:
            System.out.println(Arrays.toString(nums));

        }
    }
