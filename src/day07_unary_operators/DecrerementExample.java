package day07_unary_operators;

public class DecrerementExample {

    public static void main(String[] args) {

        int n = 20;
        int t = n;

        System.out.println("t" + t); // value of t is 20 since you just assigned t as n

        int j = --n;//j is 19. subtract first. both become 19
        System.out.println("j" + j);
        System.out.println("n" + n);

        System.out.println("n" + --n);//n becomes 18 because increment happened fisrt so prints 18
        int u = n--;
        System.out.println("u" +u);// post decrement so u stays 18
        System.out.println("n" + n);//value of n now is 17


    }
}
