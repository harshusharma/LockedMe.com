package com.LockedMe;

import java.io.File;
import java.io.IOException;

public class DifferentOperation {
	
	public boolean addition(String textinput1) throws IOException {   				//Addition method declaring
		boolean result1=false;
		String[] pathNames = { "E:", "Project", textinput1};
		String pathSeperator = System.getProperty("file.separator");
		String path = String.join(pathSeperator, pathNames);
		
        File fileInput = new File(path);
        if(fileInput.createNewFile()) {
        	result1= true;
        } else {
        	result1= false;
		}
        return result1;
	}
	
	
	public boolean deletion(String textinput2) throws IOException {   				//Deletion method declaring
		boolean result2=false;
		String[] pathNames = { "E:", "Project", textinput2};
		String pathSeperator = System.getProperty("file.separator");
		String path = String.join(pathSeperator, pathNames);	
//		String path = "C:" + pathSeperator + "Users" + pathSeperator
		File fileInput1 = new File(path); 
		
		if(fileInput1.exists()) {
			String cannonicalPath = fileInput1.getCanonicalPath();
			if (cannonicalPath.equals(path)) {
//				System.out.println("Matched");
				if(fileInput1.delete())
					result2 = true;
				} else {
//				System.out.println("Not Matched");
				result2 = false;
				}
			}				
			return result2;
		}
	
	public boolean search(String textinput3) {   				//Search method declaring
		String[] pathNames = { "E:", "Project", textinput3};
		String pathSeperator = System.getProperty("file.separator");
		String path = String.join(pathSeperator, pathNames);		
		File fileInput3 = new File(path);
		boolean result3 = fileInput3.exists();					//checking & deleting the file
		return result3;
		}

}
