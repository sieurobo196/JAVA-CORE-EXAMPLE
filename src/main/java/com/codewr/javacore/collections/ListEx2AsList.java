package com.codewr.javacore.collections;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author codewr
 */
public class ListEx2AsList {

    public static void main(String args[]) {
        // create new array
        String[] arr = {"Java", "C++", "PHP", "Python", "Java"};
        // convert array to List
        List<String> list = Arrays.asList(arr);
        // show list
        for (String s : list) {
            System.out.println(s);
        }
    }

}
