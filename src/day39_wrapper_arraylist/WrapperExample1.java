package day39_wrapper_arraylist;

public class WrapperExample1 {

    public static void main(String[] args) {

        int a = 5; //primitive type that holds value of a
        //you can't use method from it. ex a.method()
        //you can: print, assign/reassign, calculations, casting

        Integer i1 = new Integer(10); //how to make it
        Integer i2 = 100;  // 2nd way to make it. converts int primitive to integer wrapper class
        System.out.println(i1);
        System.out.println(i2);

        byte b = 4;
        //Byte b2 = new Byte(5); //here you would be storing int to byte so it wont work.
        Byte b2 = new Byte((byte)5); // you can however do it like this
        Byte b3 = (byte)500;
        Byte b4 = 100;
        System.out.println(b2);
        System.out.println(b3);//doesnt work since 500 is out of range for byte
        System.out.println(b4);

        System.out.println();

        short s = 100;
        Short s2 = new Short ((short)200);
        Short s3 = 300;

        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);

        long l = 1000; //primitive value. its int type. if we put the l it becomes long
        Long l2 = new Long(2000L);
        Long l3 = 3000L; //with wrapper classes version 2

        Float f1 = new Float(4.5F);
        Float f2 = 5.5F;



    }
}
