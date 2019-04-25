/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codewr.javacore.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author NXCOMM
 */
public class TaskExcute implements Runnable {
    
    int index;
    
    public TaskExcute(int i) {
        index = i;
    }
    
    @Override
    public void run() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println("run " + index + " - " + dateFormat.format(new Date()));
//        while (true) {            
//            
//        }
    }
    
}
