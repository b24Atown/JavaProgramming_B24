package day59_exceptions;

public class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null|| name.isEmpty()) {
            throw new IllegalArgumentException();

        }
        this.name = name;
    }

    public int getAge() {
        return age;
        }

    public void setAge(int age)throws Exception {//this is handling the exception for us but the user will still need to handle it.

        if(age<0 || age>150) {
            throw new Exception();//this is cauusing an exception if you give out of range answers.
        }

        this.age = age;
    }
}
