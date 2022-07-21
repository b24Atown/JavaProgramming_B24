package day30_array;

public class ForEachLoop {

    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5};

        for(int i = 0; i<nums.length;i++){
            System.out.println("number " + nums[i]);
        }

        System.out.println("------------");
        //for each loops
        for(int eachNumber : nums){
            System.out.println("number " + eachNumber); //eachNumber = nums[i]
        }
        //ex 2 down for loop way

        String [] strs = {"java","selenium", "db", "api"};
        for(int i = 0; i<strs.length;i++){
            System.out.println(strs[i]);

        }
        // for each loop way

        for(String word : strs){ //name for (word) can be anything you want
            System.out.println(word);

        }
    }
}
