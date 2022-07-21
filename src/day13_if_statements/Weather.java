package day13_if_statements;

public class Weather {
    public static void main(String[] args) {
        
        //sunny, rainy, windy, snowy, foggy, clowdy
        
        String weather = "windy";
        
        if (weather.equals("sunny")) {
            System.out.println("its nice outside");
        } else if (weather.equals("rainy")) {
            System.out.println("Stay iniside");
        } else if ( weather.equals("windy")) {
            System.out.println("dont blow away");
        } else if (weather.equals("snowy")){
            System.out.println("Wear your jacket");
        } else if (weather.equals("foggy")){
            System.out.println("careful driving");
        } else if (weather.equals("clowdy")) {
            System.out.println("not nicie outside");
        } else {
            System.out.println("not a valid weather type");
        }
    }
}
