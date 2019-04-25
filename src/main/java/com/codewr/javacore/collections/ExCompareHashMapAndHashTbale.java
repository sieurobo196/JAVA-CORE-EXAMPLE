/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codewr.javacore.collections;

import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;

/**
 *
 * @author NXCOMM
 */
public class ExCompareHashMapAndHashTbale {

//    public static HashMap<String, String> kaka = new HashMap<>();
    public static Hashtable<String, String> kaka = new Hashtable<>();

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            kaka.put("cutx", "admin" + i);
            Thread thread = new ThreadEx1(i, kaka);
            thread.start();

        }
    }

    static class ThreadEx1 extends Thread {

        int index;
        Hashtable<String, String> map;

        public ThreadEx1(int i, Hashtable<String, String> hashMap) {
            index = i;
            map = hashMap;
        }

        @Override
        public void run() {
            System.out.println(index + " - " + new Date());

            System.out.println(kaka.get("cutx"));
        }

    }
}
