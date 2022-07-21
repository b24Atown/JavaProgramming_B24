package office_hours.practice_10_06_2021;

public class St {

    public final String a1(){
        return "hello";
    }
    public static final String a2(){
        return "bye";
    }
}

class RunnSt {

    public static void main(String[] args) {

        St example = new St();
        System.out.println(example.a1());
        System.out.println(example.a2());

    }
}
