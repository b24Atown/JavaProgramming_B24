package day38_methods;

public class TypePromotions {

    public static void main(String[] args) {
        //byte short int long float double. it will keep going up to try and match the next in line.

        use(3); //it will go in order. first checks int, we dont have int in the methods so it goes to the next thing and finds long to print.
        use(5.5);//compiler automatically reads as a double so it will print it as a double
        use(3.2f);//here we said we wanted to use it as a float so went to that.

        byte b = 10;
        use(b);//since there is no byte or short or int it goes to closest thing to byte which is a long so prints as a long.

        //if we did use(3.3) but didnt have a double in the methods(keep in mind it automatically tries to use a double when we use decimal, it just wont compile or work. it cant go backwards.

    }


    public static void use(float f){
        System.out.println("using the float method");
    }

    public static void use (double d){
        System.out.println("using the double method");
    }
    public static void use(long d){
        System.out.println("using the long method");
    }
}
