package day58_exceptions.item;

public class Store {

    public static void main(String[] args) {

        Eragon obj1 = new Eragon();//itself
        Book obj2 = new Eragon();//parent
        Item obj3 = new Eragon();//parent

        obj1.use();
        obj2.use();
        obj3.use();
        //all references know the  use method so all have access to use. number 2 to keep in mind is that all are eragon objects so execution happens from object side. they will all print the same thing.
        obj1.sell();
        //obj2.sell();
       // obj3.sell();
        //sell method is only in eragon class so only that class will have access to it. therefore obj2 and 3 cant call it because they dont have a reference to it. doesnt matter that execution happens at eragon, the other side needs to know the reference. We can do casting however and make  them work.

        ((Eragon)obj2).sell();
        ((Eragon)obj3).sell();

        purchase(new Item ("Wooden spoon"));
        purchase(obj1);
        purchase(new Book("Harry Potter"));


    }

    public static void purchase(Item item){
        System.out.println("Purchasing " + item.name);
    }
}
