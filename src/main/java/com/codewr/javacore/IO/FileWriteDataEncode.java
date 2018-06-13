package com.codewr.javacore.IO;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
/**
 *
 * @author codewr
 */


public class FileWriteDataEncode {
	public static void main(String[] args){

	  try {
		File fileDir = new File("C:\\uploadFile\\data_test.txt");
			
		Writer out = new BufferedWriter(new OutputStreamWriter(
			new FileOutputStream(fileDir), "UTF8"));

		out.append("Website UTF-8").append("\r\n");
		out.append("cồng UTF-8").append("\r\n");
		out.append("cồng chiêng UTF-8").append("\r\n");
		
		out.flush();
		out.close();
	        
	    } 
	   catch (UnsupportedEncodingException e) 
	   {
		System.out.println(e.getMessage());
	   } 
	   catch (IOException e) 
	   {
		System.out.println(e.getMessage());
	    }
	   catch (Exception e)
	   {
		System.out.println(e.getMessage());
	   } 
	}	
}