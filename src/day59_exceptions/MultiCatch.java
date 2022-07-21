package day59_exceptions;

public class MultiCatch {

    public static void main(String[] args) {

        try{
            System.out.println(10/0);
        }catch (Exception e){//shouldnt do this because we want to handle the right exception. not handle the parent class that is all of them
            System.out.println("Handled generally");
        }//cant have RuntimeException here because we need to go from more specific first to general.

        System.out.println("--------------");

        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("HHandled in Arrithmetic block");

        } catch (RuntimeException e){
            System.out.println("Handled in runtime block");
        }catch (Exception e){
            System.out.println("Handled generally");//this way we can do it from more specific to general
        }
    }
}
