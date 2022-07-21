package day06_arithmetic_operators;

public class TicketPrice {

    public static void main(String[] args) {

        String cityOne = "Chicago";
        String cityTwo = "Virginia";

        double baseTicketPrice = 110.50;
        double milesBetweenCities = 739.8;
        double chargeBetweenCities = milesBetweenCities / 10;
        double priceChicagoToVirginia = baseTicketPrice + chargeBetweenCities;

        System.out.println("The ticket price from " + cityOne + "to " + cityTwo + "is " + priceChicagoToVirginia);

        //could have also done "double priceChicagotoVirginia = baseTicketPrice + milesBetweenCities / 10";

        float f = 40.5F;
        long l = 10;
        float result = f* l;
        long result2 = (long) ( f * l);
        //just recap of casting
    }
}
