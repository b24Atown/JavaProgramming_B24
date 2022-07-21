package day61_collections;


import day53_inheritence.rules.A;

import java.util.ArrayDeque;

public class QueueExample2 {

    public static void main(String[] args) {

        ArrayDeque <String> obj = new ArrayDeque<>();
        obj.offer("z");
        obj.offer("hello");
        obj.offer("turkey");
        System.out.println(obj);

        System.out.println(obj.peek());

        System.out.println(obj.poll());
        System.out.println(obj);
        obj.addFirst("birds");
        obj.addLast("water");
        System.out.println(obj);

    }
}
