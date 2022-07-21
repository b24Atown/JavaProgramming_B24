package day20_string;

import java.util.Scanner;

public class Practice {
        public static void main(String[] args) {
            double premium = 0;
            int accidentsAmount = 0;
            int daysDrivenToWorkOrSchool = 0;
            int milesToWorkOrSchool = 0;
            String vehicleOwnership = "";
            String vehicleUsage = "";
            String continuousInsurance = "";
            String education = "";
            String name = "";
            String referenceNumber = "";
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to the CountyFarm car insurance!");
            //WRITE YOUR CODE HERE

            System.out.println("Enter your name");
            name = scan.nextLine();

            System.out.println("Do you have a US driver license?");
            String driverLicense = scan.next();
            if (driverLicense.contains("No")) {
                System.out.println("Invalid data!");
                System.exit(0);
            }
            System.out.println("Enter your zip code");
            String zipCode = scan.next();
            if (zipCode.equals("20910") || zipCode.equals("20740")) {
                premium += 60;
            } else if (zipCode.equals("22102") || zipCode.equals("22103")) {
                premium += 30;
            } else {
                premium += 50;
            }
            System.out.println("Is this vehicle Owned, Financed, or Leased?");
            vehicleOwnership = scan.next();
            if (vehicleOwnership.equals("Owned")) {
                premium += 10;
            } else {
                premium += 20;
            }
            System.out.println("How is this vehicle primarily used?");
            vehicleUsage = scan.next();
            if (vehicleUsage.equals("Business")) {
                premium += 50;
            }
            if (vehicleUsage.equals("Pleasure")) {
                premium += 10;
            }
            if (vehicleUsage.equals("Commute")) {
                premium += 20;
                System.out.println("Days Driven To Work And/Or School");
                daysDrivenToWorkOrSchool = scan.nextInt();
                switch (daysDrivenToWorkOrSchool) {
                    case 1:
                        premium += 5;
                        break;
                    case 2:
                        premium += 10;
                        break;
                    case 3:
                        premium += 15;
                        break;
                    case 4:
                        premium += 20;
                        break;
                    case 5:
                        premium += 25;
                        break;
                    case 6:
                        premium += 30;
                        break;
                    case 7:
                        premium += 35;
                        break;
                    case 8:
                        premium += 40;
                        break;
                    case 9:
                        premium += 45;
                        break;
                    case 10:
                        premium += 50;
                        break;
                    default:

                }
            }
            System.out.println("Miles Driven To Work And/Or School");
            milesToWorkOrSchool = scan.nextInt();
            switch (milesToWorkOrSchool) {
                case 5:
                    premium += 5;
                    break;
                case 10:
                    premium += 10;
                    break;
                case 15:
                    premium += 15;
                    break;
                case 20:
                    premium += 20;
                    break;
                case 25:
                    premium += 25;
                    break;
                case 30:
                    premium += 30;
                    break;
                case 35:
                    premium += 35;
                    break;
                case 40:
                    premium += 40;
                    break;
                case 45:
                    premium += 45;
                    break;
                case 50:
                    premium += 50;
                    break;
                default:
            }
            System.out.println("How old are you?");
            int age = scan.nextInt();
            if (age < 16) {
                System.out.println("Invalid data!");
                System.exit(0);
            } else if (age > 15 && age < 18) {
                premium *= 20;
            } else if (age > 17 && age < 22) {
                premium *= 6;
            } else if (age > 21 && age < 25) {
                premium *= 2;
            }

            System.out.println("How many years you've been driving?");
            int yearsDriving = scan.nextInt();
            if (yearsDriving > 0 && ((age - yearsDriving >= 16))) {
                switch (yearsDriving) {
                    case 1:
                        premium -= 5;
                        break;
                    case 2:
                        premium -= 10;
                        break;
                    case 3:
                        premium -= 15;
                        break;
                    case 4:
                        premium -= 20;
                        break;
                    case 5:
                        premium -= 25;
                        break;
                    case 6:
                        premium -= 30;
                        break;
                    case 7:
                        premium -= 35;
                        break;
                    case 8:
                        premium -= 40;
                        break;
                    case 9:
                        premium -= 45;
                        break;
                    case 10:
                        premium -= 50;
                        break;
                }
            } else {
                System.out.println("Invalid data!");
                System.exit(0);
            }
            System.out.println("Have you had any accidents in the last 5 years?");
            String accident = scan.next();
            if (accident.equalsIgnoreCase("yes")) {
                System.out.println("How many?");
                switch (accidentsAmount) {
                    case 1:
                        premium %= 120;
                        break;
                    case 2:
                        premium %= 144;
                        break;
                    case 3:
                        premium %= 172.8;
                }
            }
            System.out.println("Have you had continuous insurance for the past 12 months?");
            continuousInsurance = scan.next();
            if (continuousInsurance.equalsIgnoreCase("No")) {
                premium *= 2;
            }
            System.out.println("What is the highest level of education you have completed?");
            education = scan.next();
            if (education.equals("PhD") || education.equals("Bachelors") || education.equals("Masters")) {
                premium *= 95;
            } else if (education.equals("Doctors")) {
                premium *= 90;
            } else {
                premium *= 105;
            }
            System.out.println(name + ", here's your quote!");
            System.out.println("Start Your Policy Today For: $" + premium);
            referenceNumber = ("" + name.substring(0, 2) + zipCode + name.substring(name.length() - 2, name.length() - 1));
            System.out.println("Reference number:" + name.substring(0, 2));
        }
    }
