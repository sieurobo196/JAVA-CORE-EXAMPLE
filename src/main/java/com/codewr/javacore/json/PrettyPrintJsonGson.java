
package com.codewr.javacore.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author codewr
 */
public class PrettyPrintJsonGson {
    public static void main(String[] args) {

        Staff staff = createDummyObject();

        //Gson gson = new Gson();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(staff);
        System.out.println(json);
        
    }

    private static Staff createDummyObject() {

        Staff staff = new Staff();

        staff.setName("codewr");
        staff.setAge(30);
        staff.setPosition("developer");
        staff.setSalary(new BigDecimal("10000"));

        List<String> skills = new ArrayList<>();
        skills.add("java");
        skills.add("php");
        skills.add("mqtt");
        skills.add("linux");

        staff.setSkills(skills);

        return staff;

    }
}
