package day30_array;

public class LargestAndSmallestCountries {

    public static void main(String[] args) {

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States", "Russia"};

        String smallest = countries[0];
        String biggest = countries[0];

        for (String country : countries){

            if (country.length()>biggest.length()){
                biggest = country;
            }
            if (country.length()<smallest.length()){
                smallest = country;
            }
        }
        System.out.println(biggest + " is the biggest country");
        System.out.println(smallest + " is the smallest country");

        for(int i = 0; i<countries.length;i++){

            if (countries[i].length() > biggest.length()){
                biggest = countries[i];
            }
            if (countries[i].length() < smallest.length()){
                smallest = countries [i];
            }
        }

    }
}
