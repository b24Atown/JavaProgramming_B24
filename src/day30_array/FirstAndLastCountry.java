package day30_array;

public class FirstAndLastCountry {

    public static void main(String[] args) {

        /*
        Print first and last character
         */
        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States", "Russia"};

        for (int i = 0; i<countries.length;i++){
            String each = countries[i];
            System.out.println(each);
            System.out.println("First letter is: " + each.charAt(0));
            System.out.println("Last letter is: " + each.charAt(each.length()-1));
            System.out.println();
        }

        System.out.println("------------For Each Below----------------");

        for (String each : countries){
            System.out.println(each);
            System.out.println("First letter is: " + each.charAt(0));
            System.out.println("Last letter is: " + each.charAt(each.length()-1));
            System.out.println();
        }

    }
}
