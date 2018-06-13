
package com.codewr.javacore.json;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author codewr
 */
public class JsonWriteWithJsonSimple {

    public static void main(String[] args) {

        JSONObject obj = new JSONObject();
        obj.put("name", "codewr");
        obj.put("age", new Integer(30));

        JSONArray list = new JSONArray();
        list.add("message 1");
        list.add("message 2");
        list.add("message 3");

        obj.put("messages", list);

        try (FileWriter file = new FileWriter("c:\\uploadFile\\test.json")) {

            file.write(obj.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(obj);

    }

}
