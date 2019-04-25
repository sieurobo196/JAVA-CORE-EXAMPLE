package com.codewr.javacore.collections;

import java.util.EnumMap;
import java.util.Map;

/**
 *
 * @author codewr
 */
public class EnumMapEx2 {

    public enum ID {
        One, Two, Three, Four
    };

    public static void main(String args[]) {
        // init enumMap
        EnumMap<ID, Student> enumMap = new EnumMap<ID, Student>(ID.class);
        // add elements to enumMap
        Student student1 = new Student("Tom", 17, "New york");
        Student student2 = new Student("Thor", 16, "London");
        Student student3 = new Student("Loki", 18, "Paris");
        Student student4 = new Student("Iron", 19, "Rome");
        enumMap.put(ID.One, student1);
        enumMap.put(ID.Two, student2);
        enumMap.put(ID.Three, student3);
        enumMap.put(ID.Four, student4);
        // show enumMap
        for (Map.Entry<ID, Student> map : enumMap.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }

}
