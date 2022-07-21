package day02_print_statements;

import day49_encapsulation.AccessModifier;

/*
 public int a;  //public modifier
    int b;  //default( no modifier implied)
    private int c;
    again here just to see for visibility.
 */

public class ComeBackFromFuture {

    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();
        obj.a = 1; //a is public so it can be seen everywhere in project,
       // obj.b = 2;  b is default. When its outside of the package, it can no longer be accessed.
       // obj.c = 3; c is private, can only be seen within same class, now were not only in different class but diff package as well.
    }
}
