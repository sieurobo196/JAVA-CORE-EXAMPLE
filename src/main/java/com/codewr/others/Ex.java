/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codewr.others;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author NXCOMM
 */
public class Ex {

    public static void main(String[] args) {
        Ex ex = new Ex();
        ex.aaaaa();
    }

    public void aaaaa() {
        Integer[] intArr = {7, 2, 6, 1, 4, 7, 4};
        List<Integer> listInt = Arrays.asList(intArr);

        Map<Integer, Integer> map = new HashMap<>();
        Integer dupCount = 0;
        StringBuilder dupvalues = new StringBuilder();

        for (Integer integer : intArr) {
            int times = Collections.frequency(listInt, integer);
            if (map.containsKey(integer)) {
                dupvalues.append(integer).append(",");
                dupCount++;
            } else {
                map.put(integer, times);
            }
        }
        System.out.println("There were " + dupCount + " duplicates in the array. The value are : " + dupvalues);
    }

    public void counterNumber() {
        int count[] = new int[10];

        for (int i = 1; i < 101; i++) {
            System.out.println(i);
            if (i < 10) {
                count[i]++;
            } else if (i < 100) {
                count[i % 10]++;
                count[i / 10]++;
            } else if (i < 1000) {
                count[i % 100]++;
                count[i / 100]++;
                int du = i % 100;
                if (du < 10) {
                    count[du]++;
                } else {
                    count[du % 10]++;
                    count[du / 10]++;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "-" + count[i]);
        }
    }

    public void convertString() {
        String s = "aabbbbcccd";

        String end = "";
        boolean duplicate = false;
        char start = s.charAt(0);
//        System.out.println(start);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (start == s.charAt(i)) {
                count++;
            } else {
//                System.out.println(start);
//                System.out.println(count);
                end += "" + start + "" + count;
                start = s.charAt(i);
                count = 1;
//                System.out.println(start + "---------");
            }

        }
        end += "" + start + "" + count;
        System.out.println(end);
    }
}
