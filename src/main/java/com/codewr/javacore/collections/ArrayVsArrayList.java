/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codewr.javacore.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author NXCOMM
 */
public class ArrayVsArrayList {
    public static void main(String[] args) {
        // create arrayList
        // no fix size and slow
        List<String> arrayList = new ArrayList<>();
        // adding String object to arrayList
        arrayList.add("Java");
        arrayList.add("C");
        arrayList.add("C++");
        arrayList.add("PHP");
        arrayList.add("Python");
         
        // convert ArrayList to Array
        System.out.println("Convert ArrayList to Array:");
        // array size fix and fast
        String[] item = arrayList.toArray(new String[arrayList.size()]);
        // show item
        for (String s : item) {
            System.out.println(s);
        }
         
        // convert Array to ArrayList
        System.out.println("Convert Array to ArrayList:");
        List<String> list2 = new ArrayList<>();
        list2 = Arrays.asList(item);
        // show list2
        System.out.println(list2);
    }

}
