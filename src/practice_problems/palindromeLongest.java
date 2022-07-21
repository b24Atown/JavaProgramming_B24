package practice_problems;

public class palindromeLongest {

    public static void main(String[] args) {

        int num = 4004;
        int num2 = 4;

        System.out.println(pal(num));


        String numrev = Integer.toString(num);
        String rev = "";
        for(int i = 0; i<numrev.length();i++){
            rev+= numrev.charAt(numrev.length()-1-i);
        }
        System.out.println(rev);
        int a = Integer.parseInt(rev);
        System.out.println(a);



    }

    public static boolean pal(int num){

        int temp = num;
        int rev = 0;
        int rem = 0;

        while (temp>0){
            rem = temp%10; //
            temp/=10; // 3
            rev = rev *10 + rem; //3 34

        }
return rev==num;


    }
}
