package com.codewr.others;

/**
 * @author codewr
 */
public class LamdaExpression {

    public static void main(String[] args) {
        Runnable java8Runner = () -> {
            System.out.println("I am running");
        };
        java8Runner.run();

    }
}
