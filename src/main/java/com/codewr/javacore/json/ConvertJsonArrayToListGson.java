package com.codewr.javacore.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;

/**
 *
 * @author codewr
 */
public class ConvertJsonArrayToListGson {

    public static void main(String[] args) {
        Gson gson = new Gson();
        String json = "[{\"name\":\"codewr\"}, {\"name\":\"thor\"}]";
        List<Staff> list = gson.fromJson(json, new TypeToken<List<Staff>>() {
        }.getType());
        for (Staff staff : list) {
            System.out.println("name: " + staff.getName());
        }
    }
}
