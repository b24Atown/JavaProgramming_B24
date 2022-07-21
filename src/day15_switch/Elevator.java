package day15_switch;


public class Elevator {
    public static void main(String[] args) {

        int floorNum = 3;

        switch (floorNum){
            case 1:
                System.out.println("Goind to floor 1");  //when the case is 1..this is the information that we get
                System.out.println("Companies on this floor are: Lobby, Verizon, Starbucks");
                break;
            case 2:
                System.out.println("Going to floor 2");
                System.out.println("Companies on this floor are: Cybertek, Sony, Walmart");
                break;
            case 3:
                System.out.println("Going to floor 3");
                System.out.println("Companies on this floor are: Apple, Walgreens, Jewels");
                break;
            case 4:
                System.out.println("Going to floor 4");
                System.out.println("Companiese on this floor are:  Ubere, Lyft, Costco");
                break;
        }

        System.out.println("--------------------------------");
        //this is the same thing with an if statement. the only difference in  the switch version  it will go directly to case 3 since thats the floornumber value. Whereas the if method down here. it will go line by line until it finds the case.

        if(floorNum==1){
            System.out.println("Goind to floor 1");
            System.out.println("Companies on this floor are: Lobby, Verizon, Starbucks");

        } else if (floorNum==2){
            System.out.println("Going to floor 2");
            System.out.println("Companies on this floor are: Cybertek, Sony, Walmart");
        } else if (floorNum==3){
            System.out.println("Going to floor 3");
            System.out.println("Companies on this floor are: Apple, Walgreens, Jewels");
        } else if (floorNum==4){
            System.out.println("Going to floor 4");
            System.out.println("Companiese on this floor are:  Ubere, Lyft, Costco");
        }
    }
}
