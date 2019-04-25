package com.codewr.javacore.collections;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author codewr
 */
public class StackEx {
    public static void main(String[] args) {
        //subclass of Vertor
        Stack<String> stack = new Stack<String>();
        stack.add("Java");
        stack.add("C++");
        stack.add("PHP");
        stack.add("Java");
        stack.add(0, "Python");
        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()) {            
            System.out.println(iterator.next());
        }
        
    }
}
