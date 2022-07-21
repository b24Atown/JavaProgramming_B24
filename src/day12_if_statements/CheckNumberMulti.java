package day12_if_statements;

public class CheckNumberMulti {

    public static void main(String[] args) {

        int firstNum = 4;
        int secondNum = 22;
        int thirdNum = 22;

        int biggest = 0;

        if (firstNum >= secondNum && firstNum >= thirdNum){
            biggest = firstNum;
        }
        else if (secondNum >= firstNum && secondNum >= thirdNum) {
            biggest = secondNum;
        }
        else if (thirdNum >= firstNum && thirdNum >= secondNum) {
            biggest = thirdNum;
        }
        System.out.println(biggest + " is the biggest number");
    }
}
