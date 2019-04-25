package com.codewr.javacore.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author codewr
 */
public class SortCollectionsEx1 {

    public static void main(String args[]) {
        // create list
        List<String> list = new ArrayList<String>();
        // add elements to list
        list.add("Java");
        list.add("C");
        list.add("C++");
        list.add("PHP");
        list.add("Python");
        // sort list
        Collections.sort(list);
        // show list
        for (String element : list) {
            System.out.println(element);
        }
    }

}
