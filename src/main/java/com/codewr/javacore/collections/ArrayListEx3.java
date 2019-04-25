package com.codewr.javacore.collections;

import java.util.ArrayList;

/**
 *
 * @author codewr
 */
public class ArrayListEx3 {

    public static void main(String[] args) {
        // Create list
        ArrayList<String> list = new ArrayList<String>();
        // Add objects to list
        list.add("Java");
        list.add("C++");
        list.add(1, "PHP");
        list.add("Java");

        // addAll()
        ArrayList<String> listA = new ArrayList<String>();
        listA.addAll(list);
        System.out.print("listA:");
        showList(listA);

        // retainAll() listA
        ArrayList<String> listB = new ArrayList<String>();
        listB.add("Java");
        listA.retainAll(listB);
        System.out.print("listB:");
        showList(listA);
        System.out.println(listA);
        // removeAll() listA
        list.removeAll(listA);
        System.out.print("listA:");
        showList(list);

        ArrayList<String> listC = new ArrayList<>();
        listC.add("C#");
        listC.addAll(listB);
        listC.addAll(1, list);
        System.out.println(listC);
        System.out.println(listC.indexOf("Java"));
        System.out.println(list.lastIndexOf("Java"));
        Object[] strings = list.toArray();
        for (Object object : strings) {
            System.out.println(object);
        }
        ArrayList<String> listD = (ArrayList<String>) listA.clone();
        System.out.println(listD);
    }

    public static void showList(ArrayList<String> list) {
        // Show list through for-each
        for (String obj : list) {
            System.out.print("\t" + obj + ", ");
        }
        System.out.println();
    }

}
