package day49_encapsulation;

public class TestModifier {
    /*
    public int a;  //public modifier
    int b;  //default( no modifier implied)
    private int c;
    these are from access modifier class. just to show for easier understanding.
     */

    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();
        obj.a = 1;
        obj.b = 2; // b we can access. b is default and since were in the same package we can access it.
       // obj.c = 3;   c is private, so we can't access it outside of the class.
        //check day 2 Comeback from the future class to see continuation of idea.

        //check paper class to understand these methods.
        Paper paper1 = new Paper();
        paper1.cut();
        paper1.fold();
        //paper1.write();  this is private so only accessed in paper class.
    }
}
