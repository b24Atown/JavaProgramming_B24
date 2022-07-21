package day31_arrays;

public class StoreInformation {

    public static void main(String[] args) {

        String [] items = {"Shoes", "Jackets","Gloves","AirPod","Ipod","Backpack"};
        double [] prices = {89.99,150.0,9.99,250.0,439.5,39.99};
        int    [] itemIds = {12345,12346,12347,12348,12349,12350};

        //Find out if the store has jackets

        boolean hasJackets = false;

        for (String itemChecker:items){
            if(itemChecker.equals("Jackets")){ //can also use .contains("Jackets")
                hasJackets = true;
                break;   //we do this just to stop the loop since we got our condition. no need to keep running. but it also works if you dont break.
            }
        }
        System.out.println(hasJackets);//or something like this
        //if(hasJackets){
        //System.out.println("Yes we have jackets, do you want some?");
        //}else{
        //System.out.println(No sorry, we dont have jackets");
        //}

        System.out.println();
        // print all the information
        for(int i = 0; i<items.length;i++){//could also be prices or itemIds.length
            System.out.println("Item ID:" + itemIds[i] + "|" + items[i] + "|" + prices[i]);
        }

        System.out.println();
        //find the information of the most expensive item
        double mostExpensive = prices[0]; //default value, then we base it off the rest
        int indexOfMax = 0;
        for(int i = 0; i<itemIds.length;i++){
            if (prices[i]>mostExpensive){
                mostExpensive = prices[i];
                indexOfMax = i;   //now we know where to find name and id. this just gives us a number so at that number we have all the other info.
            }
        }
        System.out.println("The most expensive item:");
        System.out.println("item id: " + itemIds[indexOfMax]);
        System.out.println("Price : " + prices[indexOfMax]);
        System.out.println("item : " + items[indexOfMax]);


    }
}
