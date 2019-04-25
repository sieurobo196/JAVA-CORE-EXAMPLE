
package com.codewr.javacore.collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author codewr
 */
public class ListEx1 {

    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add(1, "Python");
        list.add("Java");
        System.out.println("Phan tu co index = 2 la: " + list.get(2));
        // show list
        for (String s : list) {
            System.out.println(s);
        }
    }

}
