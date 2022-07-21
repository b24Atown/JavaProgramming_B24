package day30_array;

public class MiddleCountries {

    public static void main(String[] args) {

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States", "Russia"};
//substring part could be easier read by doing this
// int mid = country.length() /2   then
// System.out.println(country.substring(mid-1,mid+1));
        for (String country : countries){

            if (country.length() %2==0){ //two middle characters so print both
                System.out.println(country.substring(country.length()/2-1,country.length()/2+1));
                //also sout( "" + country.charAt(mid-1) + country.charAt(mid));

            }else { // one middle character so just prints that one
                System.out.println(country.charAt(country.length()/2));

            }

        }

        System.out.println("--------For loop-------------");

        for(int i = 0; i< countries.length;i++){

            int mid = countries[i].length()/2;

            if (countries[i].length() %2==0){
                System.out.println(countries[i].substring(mid-1,mid+1));
            } else {
                System.out.println(countries[i].charAt(mid));
            }

        }
    }
}
