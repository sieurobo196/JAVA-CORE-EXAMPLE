/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codewr.javacore.date.time;

import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author NXCOMM
 */
public class ExmapleTimeZone {
    public static void main(String[] args) {
        String[] list= TimeZone.getAvailableIDs();
        System.out.println(list.length);
        for(String zone:list){
            System.out.println(zone);
            TimeZone timeZone = TimeZone.getTimeZone(zone);
            System.out.println(timeZone.getID());
            System.out.println(timeZone.getDSTSavings());
            System.out.println(timeZone.getDisplayName());
            System.out.println(timeZone.getOffset(new Date().getTime()));
        }
    }
}
