package com.codewr.javacore.IO;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author codewr
 */
public class ChangeFileLastModifiedExample {
    public static void main(String[] args)
    {	
    
    	try{
    		
    		File file = new File("C:\\uploadFile\\test.txt");
    		
    		//print the original last modified date
    		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
    		System.out.println("Original Last Modified Date : " 
    				+ sdf.format(file.lastModified()));
    		
    		//set this date 
    		String newLastModified = "05/7/2018";
    		
    		//need convert the above date to milliseconds in long value 
    		Date newDate = sdf.parse(newLastModified);
    		file.setLastModified(newDate.getTime());
    		
    		//print the latest last modified date
    		System.out.println("Lastest Last Modified Date : " 
    				+ sdf.format(file.lastModified()));
    		
    	}catch(ParseException e){
    		
    		e.printStackTrace();
    		
    	}
    	
    }
}
