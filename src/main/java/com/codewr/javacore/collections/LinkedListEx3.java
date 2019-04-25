package com.codewr.javacore.collections;

import java.util.LinkedList;

/**
 *
 * @author codewr
 */
public class LinkedListEx3 {

    public static void main(String[] args) {
        // Create list
        LinkedList<String> list = new LinkedList<String>();
        // Add objects to list
        list.add("Java");
        list.add("C++");
        list.add(1, "PHP");
        list.add("Java");

        // addAll()
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.print("listA:");
        showList(listA);

        // retainAll() listA
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("Java");
        listA.retainAll(listB);
        System.out.print("listA:");
        showList(listA);

        // removeAll() listA
        list.removeAll(listA);
        System.out.print("listA:");
        showList(list);

        LinkedList<String> listC = new LinkedList<>();
        listC.add("C#");
        listC.addAll(listB);
        listC.addAll(2, list);
        System.out.println(listC);
        System.out.println(listC.indexOf("Java"));
        System.out.println(list.lastIndexOf("Java"));
        Object[] strings = list.toArray();
        for (Object object : strings) {
            System.out.println(object);
        }
        LinkedList<String> listD = (LinkedList<String>) listA.clone();
        System.out.println(listD);
    }

    public static void showList(LinkedList<String> list) {
        // Show list through for-each
        for (String obj : list) {
            System.out.print("\t" + obj + ", ");
        }
        System.out.println();
    }

}
