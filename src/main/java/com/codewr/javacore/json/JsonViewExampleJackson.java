/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codewr.javacore.json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

/**
 *
 * @author codewr
 */
public class JsonViewExampleJackson {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        //By default all fields without explicit view definition are included, disable this
        mapper.configure(SerializationConfig.Feature.DEFAULT_VIEW_INCLUSION, false);

        //For testing
        User user = createDummyUser();

        try {
            //display name only
            String jsonInString = mapper.writerWithView(Views.NameOnly.class).writeValueAsString(user);
            System.out.println(jsonInString);

            //display namd ana age
            jsonInString = mapper.writerWithView(Views.AgeAndName.class).writeValueAsString(user);
            System.out.println(jsonInString);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static User createDummyUser() {

        User user = new User();

        user.setName("codewr");
        user.setAge(33);

        List<String> msg = new ArrayList<>();
        msg.add("jackson 1");
        msg.add("jackson 2");
        msg.add("jackson 3");

        user.setMessages(msg);

        return user;

    }
}
