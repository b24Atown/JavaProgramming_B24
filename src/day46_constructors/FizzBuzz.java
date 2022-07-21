package day46_constructors;

public class FizzBuzz {

    public static void main(String[] args) {

        System.out.println(fizzBuzz(4));
        System.out.println(fizzBuzz(15));
        System.out.println(fizzBuzz(9));
        System.out.println(fizzBuzz(5));

    }

    public static String fizzBuzz(int num){

        String str = "";
        if(num%3 ==0){
            str += "Fizz";
        }
        if (num %5==0){
            str+="Buzz";
        }

       if(str.isEmpty()){
            return "" + num;
        }else {
           return str;
       }
                //str.isEmpty()? "" + num: str;
    }

}
