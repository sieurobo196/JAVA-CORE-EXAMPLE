package com.codewr.javacore.json;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author codewr
 */
public class ConvertJsonToObjectGson {

    public static void main(String[] args) {

        Gson gson = new Gson();

        try (Reader reader = new FileReader("c:\\uploadFile\\staff.json")) {

            // Convert JSON to Java Object
            Staff staff = gson.fromJson(reader, Staff.class);
            System.out.println("name: " + staff.getName());
            System.out.println("age: " + staff.getAge());
            System.out.println("position: " + staff.getPosition());
            System.out.println("salary: " + staff.getSalary());
            System.out.println("skills: " + staff.getSkills().toString());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
