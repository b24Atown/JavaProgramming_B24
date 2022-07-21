package day51_inheritance;

public class TestModifier {
    //    public int A;
    //    protected int B;
    //    int C;
    //    private int D;

    public static void main(String[] args) {

        Modifier obj = new Modifier();
        System.out.println(obj.A);
        System.out.println(obj.B);
        System.out.println(obj.C);
        // sout(obj.D) cannot be accessed because it is private so its only visible within the same class.
    }
}
