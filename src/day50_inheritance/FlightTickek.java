package day50_inheritance;

public class FlightTickek {

    private String type;
    private String departureLocation;
    private String arrivalLocation;

    public FlightTickek(String type, String departureLocation, String arrivalLocation){
        setType(type); //we used method here since we had a condition setup
        setArrivalLocation(arrivalLocation);//can do others like this if you want
        this.departureLocation= departureLocation; //or like this
        //but the setType one is important since we had condition set to it.

    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }
    public void setArrivalLocation(String arrivalLocation){
        this.arrivalLocation = arrivalLocation;
    }

    public String getType(){
        return type;
    }
    public void setType(String type){
        if(type.equals("first")|| type.equals("business")|| type.equals("economy")) {
            this.type = type;
        }
    }
    public String getDepartureLocation(){
        return departureLocation;
    }
    public void setDepartureLocation(String departureLocation){
        this.departureLocation = departureLocation;
    }

}
