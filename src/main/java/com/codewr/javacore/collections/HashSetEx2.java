package com.codewr.javacore.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author codewr
 */
public class HashSetEx2 {

    public static void main(String[] args) {
        // init set
        Set<Student> set = new HashSet<Student>();
        // create students object
        Student student1 = new Student("Tom", 17, "New york");
        Student student2 = new Student("Thor", 16, "London");
        Student student3 = new Student("Loki", 18, "Paris");
        Student student4 = new Student("Iron", 19, "Rome");
        // add students object to set
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);
        set.add(student1);
        // add null cause exception
//        set.add(null);
        // show set
        Iterator<Student> iterator = set.iterator();
        Student student;
        while (iterator.hasNext()) {
            student = iterator.next();
            System.out.println(student.toString());
        }
    }

}
