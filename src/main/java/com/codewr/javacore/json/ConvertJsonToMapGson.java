package com.codewr.javacore.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.Map;

/**
 *
 * @author codewr
 */
public class ConvertJsonToMapGson {

    public static void main(String[] args) {
        Gson gson = new Gson();
        String json = "{\"name\":\"codewr\", \"age\":30}";
        Map<String, Object> map = gson.fromJson(json, new TypeToken<Map<String, Object>>() {
        }.getType());
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("key : " + key + " , value : " + value.toString());
        }
    }
}
