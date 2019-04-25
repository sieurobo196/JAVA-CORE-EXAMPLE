package com.codewr.javacore.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 *
 * @author codewr
 */
public class QueueArrayDequeEx2 {

    public static void main(String[] args) {
        //Creating Deque and adding elements  
        Deque<String> deque = new ArrayDeque<String>();
        deque.offer("Java");
        deque.offer("C++");
        deque.add("PHP");
        deque.offerFirst("Javascript");
        deque.addLast("Python");

        System.out.println("head:" + deque.element());
        System.out.println("head:" + deque.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr = deque.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        deque.remove();
        deque.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2 = deque.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}
