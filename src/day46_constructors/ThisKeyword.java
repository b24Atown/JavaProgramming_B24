package day46_constructors;

public class ThisKeyword {

    int a = 100;  //instance variable

    public ThisKeyword(int a){  //local variable
        a = 400; //reassign local a to be 400;
    }

    public static void main(String[] args) {

        ThisKeyword obj = new ThisKeyword(200);
        System.out.println(obj.a); //100 since were printing instance variable. .a is instance variable. the 200 we put in there is just to make the method run.

        //keep in mind there is no local variable named a here so we have to print it as an instance varialbe so we say sout(obj.a). the a is outside the main method.
        //if we did this all in the thiskeyword method outside the main method, then java prioritizes local first so the a inside the method would take precedence.
    }

}
