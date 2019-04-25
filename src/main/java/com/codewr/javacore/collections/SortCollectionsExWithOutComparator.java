package com.codewr.javacore.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author codewr
 */
public class SortCollectionsExWithOutComparator {

    public static void main(String[] args) {
        // create list students
        List<Student> listStudents = new ArrayList<Student>();
        // add students to list
        Student student1 = new Student("Tom", 17, "New york");
        Student student2 = new Student("Thor", 16, "London");
        Student student3 = new Student("Loki", 18, "Paris");
        Student student4 = new Student("Iron", 19, "Rome");
        listStudents.add(student1);
        listStudents.add(student3);
        listStudents.add(student2);
        listStudents.add(student4);
        // sort list student
        Collections.sort(listStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });

        // show list students
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }
    }

}
