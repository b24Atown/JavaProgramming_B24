package day53_inheritence.rules;

public class C extends A{
    //next rule. needs to stay public since it cant be less accessible. (access modifier needs to be at least same or more accessible)
    public int getNum(){
        return 6;
    }

//getname method can be changed to protected or public access because they are more accessible. or can stay default as the same.
    @Override
    public String getName(){
        return "str";
    }
}
