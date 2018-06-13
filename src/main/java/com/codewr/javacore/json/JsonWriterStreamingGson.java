/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codewr.javacore.json;

import com.google.gson.stream.JsonWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author NXCOMM
 */
public class JsonWriterStreamingGson {

    public static void main(String[] args) {

        JsonWriter writer;
        try {
            writer = new JsonWriter(new FileWriter("c:\\uploadFile\\user.json"));

            writer.beginObject(); // {
            writer.name("name").value("codewr"); // "name" : "codewr"
            writer.name("age").value(30); // "age" : 30

            writer.name("messages"); // "messages" : 
            writer.beginArray(); // [
            writer.value("message 1");
            writer.value("message 2");
            writer.value("message 3");
            writer.endArray(); // ]

            writer.endObject(); // }
            writer.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
