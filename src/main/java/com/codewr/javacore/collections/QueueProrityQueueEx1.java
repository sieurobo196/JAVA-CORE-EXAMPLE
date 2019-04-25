package com.codewr.javacore.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author codewr
 */
public class QueueProrityQueueEx1 {

    public static void main(String args[]) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Java");
        queue.add("PHP");
        queue.add("Java");
        queue.add("Python");
        queue.add("C++");
//        queue.offer("C#"); //used to insert the specified element into this queue.
//        queue.offer("JAVA"); //used to insert the specified element into this queue.
//        queue.offer("PYTHON"); //used to insert the specified element into this queue.
        String element = queue.element();//retrieves, but does not remove, the head of this queue.
        System.out.println("head:" + element);
        String peek = queue.peek(); ////retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        System.out.println("head:" + peek);
        System.out.println("iterating the queue elements:");
        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        queue.remove(); //retrieves and removes the head of this queue.
        queue.poll(); //retrieves and removes the head of this queue, or returns null if this queue is empty.
        System.out.println("after removing two elements:");
        Iterator<String> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}
