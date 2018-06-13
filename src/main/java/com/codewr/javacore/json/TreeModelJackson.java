package com.codewr.javacore.json;

import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author codewr
 */
public class TreeModelJackson {

    public static void main(String[] args) {

        try {

            long id;
            String name = "";
            int age;

            ObjectMapper mapper = new ObjectMapper();

            JsonNode root = mapper.readTree(new File("c:\\uploadFile\\tree_user.json"));

            // Get id
            id = root.path("id").asLong();
            System.out.println("id : " + id);

            // Get Name
            JsonNode infoNode = root.path("info");
            if (infoNode.isMissingNode()) {
                // if "name" node is missing
            } else {

                name = infoNode.path("name").asText();
                age = infoNode.path("age").asInt();

                System.out.println("name : " + name);
                System.out.println("age : " + age);

            }

            // Get Contact
            JsonNode contactNode = root.path("contact");
            if (contactNode.isArray()) {
                // If this node an Arrray?
            }

            for (JsonNode node : contactNode) {
                String type = node.path("type").asText();
                String ref = node.path("ref").asText();
                System.out.println("type : " + type);
                System.out.println("ref : " + ref);

            }

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
