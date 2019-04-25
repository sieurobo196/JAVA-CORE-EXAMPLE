package com.codewr.javacore.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author codewr
 */
public class QueueArrayDequeEx3 {

    public static void main(String[] args) {
        //Creating Deque and adding elements  
        Deque<Student> deque = new ArrayDeque<Student>();
        Student student1 = new Student("Tom", 17, "New york");
        Student student2 = new Student("Thor", 16, "London");
        Student student3 = new Student("Loki", 18, "Paris");
        Student student4 = new Student("Hulk", 19, "Rome");
        deque.add(student1);
        deque.add(student2);
        deque.add(student3);
        deque.offerFirst(student4);
        System.out.println("Traversing the queue elements:");
        //Traversing queue elements  
        for (Student b : deque) {
            System.out.println(b.getName() + " - age:" + b.getAge() + " - address:" + b.getAddress());
        }
        deque.remove();
        System.out.println("After removing one book record:");
        for (Student b : deque) {
            System.out.println(b.getName() + " - age:" + b.getAge() + " - address:" + b.getAddress());
        }
    }
}
