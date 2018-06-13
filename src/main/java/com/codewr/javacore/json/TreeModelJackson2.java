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
public class TreeModelJackson2 {

    public static void main(String[] args) {

        try {

            long id;
            String firstName = "";
            String middleName = "";
            String lastName = "";

            ObjectMapper mapper = new ObjectMapper();

            JsonNode rootArray = mapper.readTree(new File("c:\\uploadFile\\tree_user_2.json"));
            for (JsonNode root : rootArray) {
                // Get id
                id = root.path("id").asLong();
                System.out.println("id : " + id);

                // Get Name
                JsonNode nameNode = root.path("name");
                if (nameNode.isMissingNode()) {
                    // if "name" node is missing
                } else {

                    firstName = nameNode.path("first").asText();
                    // missing node, just return empty string
//                    middleName = nameNode.path("middle").asText();
                    lastName = nameNode.path("last").asText();

                    System.out.println("firstName : " + firstName);
//                    System.out.println("middleName : " + middleName);
                    System.out.println("lastName : " + lastName);

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
