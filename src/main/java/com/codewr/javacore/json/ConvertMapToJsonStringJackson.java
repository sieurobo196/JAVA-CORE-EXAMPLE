package com.codewr.javacore.json;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author codewr
 */
public class ConvertMapToJsonStringJackson {

    public static void main(String[] args) {

        try {

            ObjectMapper mapper = new ObjectMapper();
            String json = "";

            Map<String, Object> map = new HashMap<String, Object>();
            map.put("name", "codewr");
            map.put("age", 30);

            // convert map to JSON string
            json = mapper.writeValueAsString(map);

            System.out.println(json);

            json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);

            // pretty print
            System.out.println(json);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
