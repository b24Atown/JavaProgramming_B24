package practice_problems;

public class  Twenty {
    //Swap two variable' values without using a third variable

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
         a +=b; // 15
         b=a-b; // 15-10 = 5
         a=a-b; //15-5 = 10
        System.out.println(a);
        System.out.println(b);


    }
}
