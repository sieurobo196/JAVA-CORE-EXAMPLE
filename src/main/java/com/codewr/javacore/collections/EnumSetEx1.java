package com.codewr.javacore.collections;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author codewr
 */

public class EnumSetEx1 {

    public static void main(String[] args) {
        Set<days> set = EnumSet.of(days.MONDAY, days.TUESDAY, days.WEDNESDAY);
//        Set<days> set1 = EnumSet.allOf(days.class);
//        Set<days> set1 = EnumSet.noneOf(days.class);
//        Set<days> set1 = EnumSet.range(days.SUNDAY, days.FRIDAY);
//        Set<days> set1 = EnumSet.copyOf(set);
     
        // traversing elements
        Iterator<days> iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}
