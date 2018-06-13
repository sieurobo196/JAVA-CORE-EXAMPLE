/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codewr.javacore.json;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author codewr
 */
public class ConvertMapToJsonFileJackson {

    public static void main(String[] args) {

        try {

            ObjectMapper mapper = new ObjectMapper();

            Map<String, Object> map = new HashMap<String, Object>();
            map.put("name", "codewr");
            map.put("age", 30);

            List<Object> list = new ArrayList<>();
            list.add("messages 1");
            list.add("messages 2");
            list.add("messages 3");

            map.put("messages", list);

            // write JSON to a file
            mapper.writeValue(new File("c://uploadFile//user.json"), map);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
