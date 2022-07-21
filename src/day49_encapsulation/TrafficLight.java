package day49_encapsulation;

public class TrafficLight {

    String color; // wrong way of doing it.
    // private String color;   this is how it should be done.

    public TrafficLight(String color){
        this.color = color;
    }

    public String getColor(){ //doing this for the private String color example
        return color;
    }

    public void setColor(String color){ // again doing this for private string color
        switch (color){
            case "red" :
            case "green":
            case "yellow":
                this.color = color;
                break;
        }
    }
}
