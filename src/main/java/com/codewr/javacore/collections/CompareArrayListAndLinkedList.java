
package com.codewr.javacore.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author coedwr
 */
public class CompareArrayListAndLinkedList {

    public static void main(String[] args) {
        // create arrayList
        List<String> arrayList = new ArrayList<String>();
        // add object in arraylist
        arrayList.add("Java");
        arrayList.add("C++");
        arrayList.add("PHP");
        arrayList.add("Python");
        for (int i = 0; i < 100000; i++) {
            arrayList.add("Java " + i);
        }
        getIndex(arrayList, 0);
        // create linkedlist
        List<String> linkedList = new LinkedList<String>();
        // aadd object in linkedlist
        linkedList.add("Hiberante");
        linkedList.add("Struts2");
        linkedList.add("Spring");
        linkedList.add("Mybatis");
        linkedList.add("Python");
        for (int i = 0; i < 100000; i++) {
            linkedList.add("Java " + i);
        }

        getIndex(linkedList, 0);
    }

    public static void getIndex(List<String> list, int index) {
        System.out.println("cutx" + System.currentTimeMillis());
        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).equals("Java " + index)) {
            System.out.println(list.get(i));
//            }
        }
        System.out.println("cutx" + System.currentTimeMillis());
    }

}
