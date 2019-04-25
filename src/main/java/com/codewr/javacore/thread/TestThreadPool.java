/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codewr.javacore.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NXCOMM
 */
public class TestThreadPool {

    public static void main(String[] args) {
        try {
            int count = 0;
            for (int i = 0; i < 10000; i++) {
                ThreadPoolExecute.add(new TaskExcute(i));
                count++;
            }
            Thread.sleep(10000);
            System.out.println("Count " + count);
            ThreadPoolExecute.stop();
        } catch (InterruptedException ex) {
            System.out.println("Exception "+ex);
        }

    }
}
