
package com.codewr.javacore.collections;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author codewr
 */
public class LinkedHashSetEx1 {
    public static void main(String[] args) {
        // init set object 
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("Java");
        linkedHashSet.add("C++");
        linkedHashSet.add("Java");
        linkedHashSet.add("PHP");
        linkedHashSet.add(null);
        // show set and LinkedHashSet has index
        for (String str : linkedHashSet) {
            System.out.println(str);
        }
    }

}
