package com.codewr.javacore.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author codewr
 */
public class ClassCollectionsExMinMax {

    public static void main(String a[]) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(46);
        list.add(67);
        list.add(24);
        list.add(16);
        list.add(8);
        list.add(12);
        list.add(67);
        int max = Collections.max(list);
        int min = Collections.max(list);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }

}
