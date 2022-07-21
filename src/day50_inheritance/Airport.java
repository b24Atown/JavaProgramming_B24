package day50_inheritance;

public class Airport {

    public static void main(String[] args) {

        FlightTickek ticket = new FlightTickek("first", "new York", "florida");

        //we cannot access directly ticket.type; ticket.departureLocation; ticket.arrivalLocation;

        System.out.println(ticket.getType());
        System.out.println(ticket.getArrivalLocation());
        System.out.println(ticket.getDepartureLocation());




    }
}
