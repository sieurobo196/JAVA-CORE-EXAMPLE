/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codewr.javacore.date.time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.*;

/**
 *
 * @author codewr
 */
public class DisplayZoneAndOffSet {

    public static void main(String[] argv) {

        Map<String, String> sortedMap = new LinkedHashMap<>();

        List<String> zoneList = new ArrayList<>(ZoneId.getAvailableZoneIds());

        //Get all ZoneIds
        getAllZoneIds(zoneList);

    }

    private static void getAllZoneIds(List<String> zoneList) {

        Map<String, String> result = new HashMap<>();

        LocalDateTime dt = LocalDateTime.now();

        for (String zoneId : zoneList) {

            ZoneId zone = ZoneId.of(zoneId);
            ZonedDateTime zdt = dt.atZone(zone);
            ZoneOffset zos = zdt.getOffset();

            //replace Z to +00:00
            String offset = zos.getId().replaceAll("Z", "+00:00");
            System.out.println(zone.toString());
            System.out.println(zos.getId());
            result.put(zone.toString(), offset);

        }
//        sortbyKey(result);
        System.out.println("Total Zone IDs: "+result.size());
//        sortByValues(result);
    }

    private static void sortbyKey(Map<String,String> result) {

        Map<String, String> map = new TreeMap<String, String>(result);
        System.out.println("After Sorting:");
        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            Map.Entry me2 = (Map.Entry) iterator2.next();
            System.out.print(me2.getKey() + ": ");
            System.out.println(me2.getValue());
        }
    }
   

}
