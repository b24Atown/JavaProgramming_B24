package day59_exceptions;

public class AllPeople {

    public static void main(String[] args) {

        Person obj = new Person();
        obj.setName("Ardit");
        //obj.setAge(33); this will cause an exception that will need to be handled.

        try{
            obj.setAge(33);
        }catch (Exception e){

        }

        System.out.println(obj.getAge());
        System.out.println(obj.getName());

       // obj.setName(null);//will throw exception because we said if we enter null, we get exception.
       try{
           obj.setAge(1111);
       }catch (Exception e){
           System.out.println("Invalid age"); //caught the exception and showing the print statement to show its caught
       }


    }
}
