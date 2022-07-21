package day05_variables;

public class Apartment {

    public static void main(String[] args) {

        String address = "20 Gamble Ave";
        String nameOfOwner = "Ardit";
        byte numberOfUnits = 55;
        short averageSizeOfUnit = 700;
        double monthlyRent = 1200;
        byte washersAndDryers = 2;
        boolean allowsPets = true;
        boolean hasPool = false;
        short lengthOfLease = 26;
        int numberOfResidents = 1111;
        long phoneNumber = 647_997_4543L;
        boolean isNearGasStation = true;
        byte numberOfFloors = 12;
        boolean hasBasement = true;
        boolean hasUnitsForRent = true;
        boolean hasAirConditioning = false;
        int numberOfParkingSpaces = 222;
        boolean hasWheelchairAccess = false;
        char reviewStars = 3;

        double monthlyRentAfter3Years = monthlyRent * 0.9;
        double monthlyRentAfter6Years = monthlyRent * 0.8;
        double averageResidentsPerUnit = numberOfResidents / numberOfUnits;
        double averageParkingSpots = numberOfParkingSpaces / numberOfUnits;
        double averageUnitsPerFloor = numberOfUnits / numberOfFloors;

        System.out.println("Rent After 3 Years: " + monthlyRentAfter3Years);
        System.out.println("Rent After 6 Years: " + monthlyRentAfter6Years);
        System.out.println("Residents/Unit: " + averageResidentsPerUnit);
        System.out.println("Parking Spots/Unit: " + averageParkingSpots);
        System.out.println("Units/Floor: " + averageUnitsPerFloor);




    }
}
