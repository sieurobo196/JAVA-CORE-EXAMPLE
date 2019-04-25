package com.codewr.javacore.collections;

import java.util.ArrayList;

/**
 *
 * @author codewr
 */
public class ArrayListEx2 {

    public static void main(String[] args) {
        // Create listStudent
        ArrayList<Student> listStudent = new ArrayList<Student>();
        // Create students
        Student student1 = new Student("Tom", 27);
        Student student2 = new Student("Thor", 25);
        Student student3 = new Student("Loki", 26);
        // Add objects to listStudent
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        // Show listStudent
        for (Student student : listStudent) {
            System.out.println(student.toString());
        }

    }

}
