package com.codewr.javacore.json;

import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author codewr
 */
public class PrettyPrintJsonJackson {

    public static void main(String[] args) throws IOException {
        String test = "{\"age\":30,\"messages\":[\"message 1\",\"message 2\",\"message 3\"],\"name\":\"codewr\"}";
        ObjectMapper mapper = new ObjectMapper();
        Object json = mapper.readValue(test, Object.class);
        String jsonStr = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(json);
        System.out.println(jsonStr);
    }
}
