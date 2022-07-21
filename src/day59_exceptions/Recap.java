package day59_exceptions;

public class Recap {

    public static void main(String[] args) {
        int [] nums = {3,5,1,5};

        try{

            System.out.println(nums[2]);//valid case
            System.out.println(nums[333]);//invalid case
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("That was invalid index");
            System.out.println(nums[666]);//causing exception again to show how finally works
        } finally { //method or action that will always be run
            System.out.println("Done");

        }
        System.out.println("This wont print if there was another exception that wasnt caught");
    }
}
