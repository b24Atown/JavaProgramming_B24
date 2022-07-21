package day53_inheritence;

public final class FinalExamples { //will never be able to be inherited by another class

    final int a;
    public static final String PLANET = "Earth";
    //will neveer be able to change value of either values;


    public FinalExamples(int a){
        this.a = a;
    }

    public static void main(String[] args) {


        FinalExamples  obj = new FinalExamples(5);
        System.out.println(obj.a);
        //obj.a = 10; a is final so we cannot change the value
    }
}
