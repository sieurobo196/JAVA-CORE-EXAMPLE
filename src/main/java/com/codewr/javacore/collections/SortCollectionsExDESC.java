/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codewr.javacore.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author NXCOMM
 */
public class SortCollectionsExDESC {

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
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        // show list
        for (String element : list) {
            System.out.println(element);
        }
    }

}
