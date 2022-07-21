package day61_collections;

import day57_polymorphism.driver.Link;

import java.util.List;
import java.util.Stack;

public class StackPractice {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();//Last in First Out
        stack.push("a");
        stack.push("b");
        stack.push("c");//this is last in so it will be first out
        System.out.println(stack);
        System.out.println("At the top of the stack: " + stack.peek());//shows whats at the top
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
