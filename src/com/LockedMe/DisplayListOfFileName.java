package com.LockedMe;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DisplayListOfFileName {

	public static void display()
	{
		File fileInput = new File("c://Users//LPTE//eclipse-workspace//");
		
		if(fileInput.isDirectory()){
			List <String> listFile = Arrays.asList(fileInput.list());
			System.out.println("Listing files unsorted");
			for(String s:listFile){
				System.out.println(s);
			}
			
		/*	Collections.sort(listFile);
			System.out.println("Listing files sorted ussing collction.sort()");
			for(String s:listFile){
				System.out.println(s);
			}
			
			Set<String> set = new TreeSet<String>(listFile);
			System.out.println("Listing files sorted using TreeSet");
			for(String s:set){
				System.out.println(s);*/
			}
			
		}
	}
