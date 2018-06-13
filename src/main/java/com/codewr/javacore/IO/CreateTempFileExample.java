package com.codewr.javacore.IO;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author codewr
 */

public class CreateTempFileExample
{
    public static void main(String[] args)
    {	
    
    	try{
    		
    	   //create a temp file
    	   File temp = File.createTempFile("test", ".tmp"); 
    		
    	   System.out.println("Temp file : " + temp.getAbsolutePath());
    		
    	}catch(IOException e){
    		
    	   e.printStackTrace();
    		
    	}
    	
    }
}