/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codewr.javacore.json;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author codewr
 */
public class ConvertJsonToObjectJackson {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {

            // Convert JSON string from file to Object
            User user = mapper.readValue(new File("C:\\uploadFile\\user.json"), User.class);
            System.out.println(user.getAge());
            System.out.println(user.getName());
            System.out.println(user.getMessages().toString());

            // Convert JSON string to Object
            String jsonInString = "{\"age\":30,\"messages\":[\"msg 1\",\"msg 2\"],\"name\":\"codewr\"}";
            User user1 = mapper.readValue(jsonInString, User.class);
            System.out.println(user1.getAge());
            System.out.println(user1.getName());
            System.out.println(user1.getMessages().toString());

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
