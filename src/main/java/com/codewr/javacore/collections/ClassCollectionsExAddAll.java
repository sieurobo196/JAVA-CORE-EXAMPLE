package com.codewr.javacore.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author codewr
 */
public class ClassCollectionsExAddAll {

    public static void main(String a[]) {
        // create list
        List<String> list = new ArrayList<String>();
        // add elements to list
        list.add("C++");
        list.add("Java");
        list.add("PHP");
        // print list
        System.out.println(list);

        // add elements to list
        Collections.addAll(list, "Servlet", "JSP");

        // print list
        System.out.println(list);

        // create array of String
        String[] strArr = {"C#", ".Net"};
        // add elements to list
        Collections.addAll(list, strArr);
        // print list
        System.out.println(list);
    }

}
