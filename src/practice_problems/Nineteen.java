package practice_problems;

public class Nineteen {

    //Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
    public static void main(String[] args) {
        System.out.println(Finra(45));
    }


    public static String Finra(int n) {
        String result = "";
        for (int i = 1; i <= n; i++) {
            if(i%3==0 && i%5==0){
                result+="finra ";
            }else if(i%3==0){
                result+="fin ";
            }else if(i%5==0){
                result+="ra ";
            }else {
                result+= i + " " ;
            }

        }
        return result;
    }

}
