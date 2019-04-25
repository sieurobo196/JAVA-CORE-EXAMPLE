/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codewr.javacore.thread;

/**
 *
 * @author NXCOMM
 */
public class TestThread {

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            Thread thread = new Thread(new TaskExcute(i));
            thread.start();
        }
    }
}
