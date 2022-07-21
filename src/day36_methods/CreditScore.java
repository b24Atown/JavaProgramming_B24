package day36_methods;

public class CreditScore {

    public static void main(String[] args) {

        int i = getCreditScore();
        System.out.println(i);
        System.out.println(getCreditScore());


        System.out.println(hasGoodCreditScore(869));
        System.out.println(hasGoodCreditScore(700));

        if(hasGoodCreditScore(749)){
            System.out.println("Good Score");
        }else{
            System.out.println("bad Score");
        }
    }

    public static int getCreditScore(){
        return 800;
    }

    public static boolean hasGoodCreditScore(int score){
        if(score>750){
            return true;
        }else{
            return false;
        }
    }
}
