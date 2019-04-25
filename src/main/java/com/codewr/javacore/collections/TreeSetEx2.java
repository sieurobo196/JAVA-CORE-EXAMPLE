package com.codewr.javacore.collections;

import java.util.TreeSet;

/**
 *
 * @author codewr
 */
public class TreeSetEx2 {

    public static void main(String[] args) {
      // init set
        TreeSet<Student> treeSet = new TreeSet<Student>();
        // create students object
        Student student1 = new Student("Tom", 17, "New york");
        Student student2 = new Student("Thor", 16, "London");
        Student student3 = new Student("Loki", 18, "Paris");
        Student student4 = new Student("Iron", 19, "Rome");
        // add students object to set
        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student1);
        // show set
        // show treeSet
        for (Student student : treeSet) {
            System.out.println(student.toString());
        }

    }

}
