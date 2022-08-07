package com.LockedMe;

import java.io.IOException;
import java.util.Scanner;


public class LockedMe {

	public static void main(String[] args) throws IOException {
	
		boolean repeatMainContext, repeatOptions;
		int operationSelected=0;
			System.out.println("Application Name : LockedMe.com");
			System.out.println("Name of Developer : Harsh Sharma");
			
			// Starting the Application Options
		do
		{
			int choice = 0;
			repeatMainContext=true;
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Please select the option from the following:");
			System.out.println("1. Display all available file Names in directory");
			System.out.println("2. Different Operations to Perform in directory");
			System.out.println("3. Close the Application");
			
			try {choice=new Scanner(System.in).nextInt();} catch(Exception e){}                        // exception handling
			
			if(choice==1)
			{
				DisplayListOfFileName listObj = new DisplayListOfFileName();
				System.out.println("The available files in directory are as follows:");
				listObj.display();
			}
			else if(choice==2)
			{
				do {
					repeatOptions = true;
					DifferentOperation DiffOperationObject = new DifferentOperation ();
					System.out.println("-----------------------------------------------------------");
					System.out.println("Please select the Operation to Perform from the following");
					System.out.println("1. Add File");
					System.out.println("2. Delete File");
					System.out.println("3. Search File");
					System.out.println("4. Back");
					
					try
					{	Scanner UserChoiceOfOperation = new Scanner (System.in);                      // exception handling
						operationSelected=UserChoiceOfOperation.nextInt();
					}
					catch (Exception e) {}
					
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
								System.out.println("Going Back to Main Menu");
								repeatOptions = false;
								break;
								
							default:
								System.out.println("Incorrect Entry");
								System.out.println("Please Try Again");
							}
						} while (repeatOptions);
					}
					else if (choice==3)
						{
						System.out.println("Bye Bye....");
						repeatMainContext=false;
						}	
					else
						{
						System.out.println("Incorrect Entry");
						System.out.println("Please Try Again");
						}
		} while (repeatMainContext);
	} 
}