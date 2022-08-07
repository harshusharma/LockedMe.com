package com.LockedMe;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DisplayListOfFileName {

	public void display()
	{
		String[] pathNames = { "E:", "Project"};
		String pathSeperator = System.getProperty("file.separator");
		String path = String.join(pathSeperator, pathNames);
		File fileInput = new File(path);
		
		if(fileInput.isDirectory()){
			List <String> listFile = Arrays.asList(fileInput.list());
			System.out.println("Listing sorted files");
			for(String s:listFile){
				
				System.out.println(s);
			}
		}		
	}
}