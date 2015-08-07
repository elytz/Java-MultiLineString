package com.multiline.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MultiLine{
    public static String string() {
		
        StackTraceElement element = new RuntimeException().getStackTrace()[1];
		
		//Get the java file name where we call this method and replace all package (.) with directory (/)
        String name = element.getClassName().replace('.', '/') + ".java";
		
		//Get Inputstream for the java file where we call this method
		InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream(name);
		
		//Read the line between /* */ from the line number where we call this method
        String s = getString(element.getLineNumber(), in, false);
        return s.substring(s.indexOf("/*") + 2, s.indexOf("*/"));
    }

	
	public static String stringTrim(){
		StackTraceElement element = new RuntimeException().getStackTrace()[1];
		
		//Get the java file name where we call this method and replace all package (.) with directory (/)
        String name = element.getClassName().replace('.', '/') + ".java";
		
		//Get Inputstream for the java file where we call this method
		InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream(name);
		
		//Read and trim the line between /* */ from the line number where we call this method
        String s = getString(element.getLineNumber(), in, true);
        return s.substring(s.indexOf("/*") + 2, s.indexOf("*/"));
	}

    private static String getString(int lineNumber, InputStream is, boolean trimLine) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();

        String line = null;
        int i = 1;
        try {
            while ((line = reader.readLine()) != null) {
                if (i++ >= lineNumber) {
					
					//handle trim logic
					if(trimLine)
						sb.append(line.trim() + "\n");
					else
						sb.append(line + "\n");
					
					//break the loop to improve performance
					if(line.contains("*/"))
					break;
                }
				
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return sb.toString();
    }

}
