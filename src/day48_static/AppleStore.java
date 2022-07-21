package day48_static;

public class AppleStore {

    public static void main(String[] args) {

        IPhone phone1 = new IPhone("20", "Black",1300,128);
        IPhone phone2 = new IPhone("10","White");

        System.out.println(phone1);
        System.out.println(phone2);

        System.out.println(IPhone.brand);
        System.out.println(IPhone.operatingSystem);
    }
}
