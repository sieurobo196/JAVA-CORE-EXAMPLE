package com.codewr.javacore.collections;

import java.util.TreeSet;

/**
 *
 * @author codewr
 */
public class TreeSetEx1 {

    public static void main(String[] args) {
        // init treeSet object sort increase
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Java");
        treeSet.add("C++");
        treeSet.add("Java");
        treeSet.add("PHP");
        // show treeSet
        for (String str : treeSet) {
            System.out.println(str);
        }
    }

}
