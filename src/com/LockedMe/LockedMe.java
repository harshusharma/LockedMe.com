package com.LockedMe;

import java.util.Scanner;

public class LockedMe {

	public static void main(String[] args) {
			System.out.println("Application Name : LockedMe.com");
			System.out.println("Name of Developer : Harsh Sharma");
			
			// Starting the Application Options
		String repeat;
		
			System.out.println("Please select the option from the following:");
			System.out.println("1. Display all available file Names in directory");
			System.out.println("2. Different Operations to Perform in directory");
			System.out.println("3. Close the Application");
			Scanner UserInput = new Scanner (System.in);
			int choice=UserInput.nextInt();
			
			if(choice==1)
			{
			do {	
				DisplayListOfFileName listObj = new DisplayListOfFileName();
				System.out.println("The of available files in directory are as follows:");
				listObj.display();
				System.out.println("Do you want to continue:(Y/N)");
				Scanner UserInput1 = new Scanner (System.in);
				String UserChoice = UserInput1.next();
				repeat = UserChoice;
				} while (repeat=="N");
			}
			else if(choice==2)
			{
				DifferentOperation DiffOperationObject = new DifferentOperation ();
				System.out.println("Please select the Operation to Perform from the following");
				System.out.println("1. Add File");
				System.out.println("2. Delete File");
				System.out.println("3. Search File");
				System.out.println("4. Back");
				Scanner UserChoiceOfOperation = new Scanner (System.in);
				int operationSelected=UserChoiceOfOperation.nextInt();
							
				switch(operationSelected)
				{
					case 1: 					//Add file method call
						System.out.println("Enter the name of the file to be added in directory" + " : ");
						Scanner UserInputForAddition = new Scanner (System.in);
						String textinput1 = UserInputForAddition.next(); 
						boolean result1 = DiffOperationObject.addition(textinput1);
						
						{
							if(result1==true)
							System.out.println(textinput1+" file is created in directory");
							else
							System.out.println("The file is not created, as "+textinput1+" already exist in directory");	
						}
						break;
						
					case 2: 					//Delete file method call
						System.out.println("Enter the name of the file to be deleted from directory" + " : ");
						Scanner UserInputForDeletion = new Scanner (System.in);
						String textinput2 = UserInputForDeletion.next(); 
						boolean result2 = DiffOperationObject.deletion(textinput2);
						
						{
							if(result2==true)
							System.out.println(textinput2+" file is deleted in directory");
							else
							System.out.println("The file is not deleted, as "+textinput2+" file does not exist in directory");	
						}
						break;
						
					case 3: 					//search file method call
						System.out.println("Enter the name to search in directory" + " : ");
						Scanner UserInputForSearch = new Scanner (System.in);
						String textinput3 = UserInputForSearch.next(); 
						boolean result3 = DiffOperationObject.search(textinput3);
						
						{
							if(result3==true)
							System.out.println(textinput3+" file found in directory");
							else
							System.out.println("The file "+textinput3+" not found in directory");	
						}
						break;
						
					case 4:
						System.out.println("Back to Main Menu");
						break;
						
					default:
						System.out.println("Incorrect Entry");
					} 	
				}	else 
						{
						System.out.println("Program Closed");
						}
		} while(repeat);	
	}
}