
package com.codewr.javacore.collections;

import java.util.LinkedList;

/**
 *
 * @author codewr
 */
public class LinkedListEx2 {

    public static void main(String[] args) {
        // Create listStudent
        LinkedList<Student> listStudent = new LinkedList<Student>();
        // Create students
        Student student1 = new Student("Tom", 27);
        Student student2 = new Student("Thor", 25);
        Student student3 = new Student("Loki", 26);
        // Add objects to listStudent
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        // Show listStudent
        System.out.println("Show listStudent");
        for (Student student : listStudent) {
            System.out.println("\t" + student.toString());
        }
        // Remove student2 from listStudent
        listStudent.remove(student2);
        // Show listStudent
        System.out.println("Show listStudent");
        for (Student student : listStudent) {
            System.out.println("\t" + student.toString());
        }
    }

}

//class Student {
//
//    private String name;
//    private int age;
//
//    public Student(String name, int age) {
//        super();
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Student@[name=" + name + ", age=" + age + "]";
//    }
//}
