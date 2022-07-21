package practice_problems;

import com.sun.tools.corba.se.idl.constExpr.Divide;

public class Eighteen {

    //18. Write a method that can divide two numbers without using division operator

    public static void main(String[] args) {

        int one = -55;
        int two = -2;

        System.out.println(Divide(one,two));
    }

    public static int Divide(int one, int two){
        int result = 0;
        if(one<0){
            one = -one;

        }
        if(two<0){
            two = -two;
        }
        int temp = one;



        while(temp>=two){
            result++;
            temp-=two;
        }
        if(two<0){
            result=-result;
        }

return result;
    }
}

