package com.codewr.javacore.collections;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author codewr
 */
public class HashSetEx1 {

    public static void main(String[] args) {
        // init set object
        Set<String> set = new HashSet<String>();
        set.add("C++");
        set.add("Java");
        set.add("Java");
        set.add("PHP");
        set.add(null);
        // show set
        for (String str : set) {
            System.out.println(str);
        }
    }

}
