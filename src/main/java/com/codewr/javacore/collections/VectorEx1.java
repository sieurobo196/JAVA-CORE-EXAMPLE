package com.codewr.javacore.collections;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author codewr
 */
public class VectorEx1 {

    public static void main(String[] args) {
        //the same ArrayList
        Vector<String> vector = new Vector<String>();
        vector.add("Java");
        vector.add("C++");
        vector.add("PHP");
        vector.add(2, "Python");
        vector.add("Java");
        Iterator<String> itr = vector.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
