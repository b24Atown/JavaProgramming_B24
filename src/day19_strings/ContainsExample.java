package day19_strings;

public class ContainsExample {
    public static void main(String[] args) {

        String name = "mr james";
        System.out.println(name.contains("mr"));
        //self explanatory. turns boolean value

        String address = "204948 road w drive, 98090";
        System.out.println(address.contains("204") && address.contains("drive"));
        //you can check multiple things as well. so this is true. check for spaces and cases to make sure youre looking for the appropriate thing.


    }
}
