package day49_encapsulation;

public class AccessModifier {

    public int a;  //public modifier
    int b;  //default( no modifier implied)
    private int c;

    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();
        obj.a = 1;
        obj.b = 2;
        obj.c = 3;
        //same file we have access to all 3. so can use or access public modifier, default modifier and private.
        //we tested this in Test modifier in same package and day2 package under comeback from future class.
    }
}
