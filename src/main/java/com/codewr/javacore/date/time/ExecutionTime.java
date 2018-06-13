/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codewr.javacore.date.time;

import java.time.Instant;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author NXCOMM
 */
public class ExecutionTime {

    public static void main(String[] args) throws InterruptedException {
        ExecutionTime executionTime = new ExecutionTime();
        executionTime.execution1();
        executionTime.execution2();
        executionTime.execution3();
        executionTime.execution4();
    }

    // use System.nanoTime()
    public void execution1() throws InterruptedException {
        System.out.println("--With System.nanoTime()");
        //start
        long lStartTime = System.nanoTime();

        //task
        calculation();

        //end
        long lEndTime = System.nanoTime();

        //time elapsed
        long output = lEndTime - lStartTime;

        System.out.println("Elapsed time in milliseconds: " + output / 1000000);
    }

    //System.currentTimeMillis()
    public void execution2() throws InterruptedException {
        System.out.println("--With System.currentTimeMillis()");
        long lStartTime = System.currentTimeMillis();

        calculation();

        long lEndTime = System.currentTimeMillis();

        long output = lEndTime - lStartTime;

        System.out.println("Elapsed time in milliseconds: " + output);
    }

    //Instant.now().toEpochMilli()
    public void execution3() throws InterruptedException {
        System.out.println("--With Instant.now().toEpochMilli()");
        long lStartTime = Instant.now().toEpochMilli();

        calculation();

        long lEndTime = Instant.now().toEpochMilli();

        long output = lEndTime - lStartTime;

        System.out.println("Elapsed time in milliseconds: " + output);
    }

    // Date().getTime()
    public void execution4() throws InterruptedException {
        System.out.println("--With Date().getTime()");
        long lStartTime = new Date().getTime();

        calculation();

        long lEndTime = new Date().getTime();

        long output = lEndTime - lStartTime;

        System.out.println("Elapsed time in milliseconds: " + output);

    }

    private void calculation() throws InterruptedException {

        //Sleep 2 seconds
        TimeUnit.SECONDS.sleep(2);

    }

}
