package day53_inheritence.rules;

public class B extends A{
    //cannot change the signature (name and parameter)
    @Override
    public int getNum(){
        return 5;
    }
}
