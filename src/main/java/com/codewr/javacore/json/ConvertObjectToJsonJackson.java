package com.codewr.javacore.json;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author codewr
 */
public class ConvertObjectToJsonJackson {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        //For testing
        User user = createDummyUser();

        try {
            //Convert object to JSON string and save into file directly 
            mapper.writeValue(new File("C:\\uploadFile\\user.json"), user);

            //Convert object to JSON string
            String jsonInString = mapper.writeValueAsString(user);
            System.out.println(jsonInString);

            //Convert object to JSON string and pretty print
            jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
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
