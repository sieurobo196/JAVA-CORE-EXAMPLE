package com.codewr.javacore.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author codewr
 */
public class QueueProrityQueueEx2 {

    public static void main(String args[]) {
        Queue<Student> queue = new PriorityQueue<Student>();
        Student student1 = new Student("Tom", 17, "New york");
        Student student2 = new Student("Thor", 16, "London");
        Student student3 = new Student("Loki", 18, "Paris");
        queue.add(student1);
        queue.add(student2);
        queue.add(student3);
        System.out.println("Traversing the queue elements:");
        //Traversing queue elements  
        for (Student b : queue) {
            System.out.println(b.getName() + " - age:" + b.getAge() + " - address:" + b.getAddress());
        }
        queue.remove();
        System.out.println("After removing one book record:");
        for (Student b : queue) {
             System.out.println(b.getName() + " - age:" + b.getAge() + " - address:" + b.getAddress());
        }
    }

}
