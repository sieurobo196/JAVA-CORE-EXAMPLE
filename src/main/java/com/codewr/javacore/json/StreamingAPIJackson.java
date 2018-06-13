package com.codewr.javacore.json;

import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.JsonMappingException;

/**
 *
 * @author codewr
 */
public class StreamingAPIJackson {

    public static void main(String[] args) {

        try {

            JsonFactory jfactory = new JsonFactory();

            /**
             * * read from file **
             */
            JsonParser jParser = jfactory.createJsonParser(new File("c:\\uploadFile\\user.json"));

            // loop until token equal to "}"
            while (jParser.nextToken() != JsonToken.END_OBJECT) {

                String fieldname = jParser.getCurrentName();
                if ("name".equals(fieldname)) {

                    // current token is "name",
                    // move to next, which is "name"'s value
                    jParser.nextToken();
                    System.out.println(jParser.getText()); // display codewr

                }

                if ("age".equals(fieldname)) {

                    // current token is "age", 
                    // move to next, which is "name"'s value
                    jParser.nextToken();
                    System.out.println(jParser.getIntValue()); // display 30

                }

                if ("messages".equals(fieldname)) {

                    jParser.nextToken(); // current token is "[", move next

                    // messages is array, loop until token equal to "]"
                    while (jParser.nextToken() != JsonToken.END_ARRAY) {

                        // display message 1, message 2, message 3
                        System.out.println(jParser.getText());

                    }

                }

            }
            jParser.close();

        } catch (JsonGenerationException e) {

            e.printStackTrace();

        } catch (JsonMappingException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}

//public void writeFileJson() {
//        try {
//
//            JsonFactory jfactory = new JsonFactory();
//
//            /**
//             * * write to file **
//             */
//            JsonGenerator jGenerator = jfactory.createJsonGenerator(
//                    new File("c:\\uploadFile\\user.json"), JsonEncoding.UTF8);
//            jGenerator.writeStartObject(); // {
//
//            jGenerator.writeStringField("name", "codewr");
//            jGenerator.writeNumberField("age", 30);
//
//            jGenerator.writeFieldName("messages"); // "messages" :
//            jGenerator.writeStartArray(); // [
//
//            jGenerator.writeString("message 1");
//            jGenerator.writeString("message 2");
//            jGenerator.writeString("message 3");
//
//            jGenerator.writeEndArray(); // ]
//
//            jGenerator.writeEndObject(); // }
//
//            jGenerator.close();
//
//        } catch (JsonGenerationException e) {
//
//            e.printStackTrace();
//
//        } catch (JsonMappingException e) {
//
//            e.printStackTrace();
//
//        } catch (IOException e) {
//
//            e.printStackTrace();
//
//        }
//    }
//}
