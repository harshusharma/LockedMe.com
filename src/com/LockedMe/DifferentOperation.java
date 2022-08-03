package com.LockedMe;

import java.io.File;
import java.io.IOException;

public class DifferentOperation {
	
	public boolean addition(String textinput1) {   				//Addition method declaring
	boolean result1=false;
		try {
        File fileInput = new File("C:\\Users\\LPTE\\eclipse-workspace\\"+textinput1);
        if(fileInput.createNewFile())
        	result1= true;
        else
        	result1= false;
		}
    catch(IOException io) {
        io.printStackTrace();
    		}
	
		return result1;
	}
	
	
	public boolean deletion(String textinput2) {   				//Deletion method declaring
		boolean result2=false;
			{
			File fileInput1 = new File("c://Users//LPTE//eclipse-workspace//"+textinput2+".txt"); 
	        if(fileInput1.delete())
	        	result2 = true;
	        	else
	        	result2 = false;
			}
			return result2;
		}
	
	public boolean search(String textinput3) {   				//Search method declaring
			File fileInput3 = new File("c://Users//LPTE//eclipse-workspace//"+textinput3+".txt");
			boolean result3 = fileInput3.exists();
			return result3;
		}

}
