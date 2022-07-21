package day32_array;


public class AWS {

    public static void main(String[] args) {

        String app = "etsy";
        String zones = "us-east-1,us-west-1,us-west-2,us-west-3";

        //2nd way which we normally use- String[] allZones = zones.split(",");
        for (String each : zones.split(",")) {//dont need to make a variable if you didnt want to
            System.out.println("Deploying " + app + " to " + each);
        }

        //for ( int i = 0; i<zones.length();i++){
       // System.out.println("Deploying " + app + " to " + allZones[i]);
        //}

    }
}
