package day48_static;

public class MoreChaining {

   public MoreChaining() {
      System.out.println("First");
   }

   public MoreChaining(int i) {
      // MoreChaining(); we cannot use the name to call another constructor. we use this()
      this();//so this is calling the constructor with no parameters. thats the first constructor thats printing first.
   }
   public MoreChaining(String s){
      this(5); //5 is a random #. no logic here. just trying to make the chaining run. so its calling the int constructor.
      System.out.println("String one");
      //this(5); any this() call needs to be the first line.
   }
   public MoreChaining(double d){
      //this(10);
     // this("java");
      //we cant call two constructors, we can only call one or the other.
   }
   public MoreChaining (char c){
     // this('s');
      //cant call itself.
   }

   /*
   public MoreChaining (boolean b){
     // this(4.5f);

   }
   public MoreChaining (float f){
     // this(true);
   }
   //cant do this either because the constructors are calling each other and it just loops.
    */


}
