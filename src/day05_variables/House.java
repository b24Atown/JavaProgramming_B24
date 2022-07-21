package day05_variables;

public class House {

    public static void main(String[] args) {

        String houseType = "Appartment";
        int numberOfBedrooms = 2;
        byte numberOfBathrooms = 2;
        short numberOfKitchens = 1;
        boolean hasBasement = true;
        boolean hasAttic = false;
        boolean hasPool = false;
        boolean isForSale = false;
        double costOfHouse = 256_000;
        String address = "10545 Saskatchewan DR";
        String zipCode = "T6E 6C6";
        boolean hasParkNearby = true;
        char schoolRating = '4';

        System.out.println("\t\t\tNew Home Specifications" + "\n");
        System.out.println("Price: " + costOfHouse);
        System.out.println("Type: " + houseType);
        System.out.println("Bedrooms: " + numberOfBedrooms);
        System.out.println("Bathrooms: " + numberOfBathrooms);
        System.out.println("Kitchens: " + numberOfKitchens + "\n");
        System.out.println("\t\t\tExtra Features" + "\n");
        System.out.println("Has Basement: " + hasBasement);
        System.out.println("Has Attic: " + hasAttic);
        System.out.println("Has Pool: " + hasPool);
        System.out.println("For Sale: " + isForSale + "\n");
        System.out.println("\t\t\tLocation" + "\n");
        System.out.println("Address: " + address);
        System.out.println("Postal Code: " + zipCode);
        System.out.println("Close to Parks: " + hasParkNearby);
        System.out.println("School District Rating (/5) " + schoolRating);



    }
}

