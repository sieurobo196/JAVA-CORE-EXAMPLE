/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codewr.javacore.json;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NXCOMM
 */
public class ConvertObjectToJsonStringGson {

    public static void main(String[] args) {

        Staff staff = createDummyObject();

        //1. Convert object to JSON string
        Gson gson = new Gson();
        String json = gson.toJson(staff);
        System.out.println(json);

        //2. Convert object to JSON string and save into a file directly
        try (FileWriter writer = new FileWriter("C:\\uploadFile\\staff.json")) {

            gson.toJson(staff, writer);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static Staff createDummyObject() {

        Staff staff = new Staff();

        staff.setName("codewr");
        staff.setAge(20);
        staff.setPosition("developer");
        staff.setSalary(new BigDecimal("1000"));

        List<String> skills = new ArrayList<>();
        skills.add("java");
        skills.add("php");
        skills.add("linux");
        skills.add("mqtt");

        staff.setSkills(skills);

        return staff;

    }
}
