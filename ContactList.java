package metzler_p5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ContactList {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(File in) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int i=0, j=0, k=0;
		String Storage[] = new String[20];
		String str;
		int ContactNum = 0;
		
		if(FileEmpty(in));		
		else		
			FileToRAM(Storage, in);
		
		while(j==0) {
			System.out.printf("");
			System.out.printf("Contact List Operations");
			System.out.printf("=======================");
			System.out.printf("");
			System.out.printf("1) view the list");
			System.out.printf("2) add an item");
			System.out.printf("3) edit an item");
			System.out.printf("4) remove an item");
			System.out.printf("5) save the current list");
			System.out.printf("6) quit to the main menu");
		
			i = sc.nextInt();
			
			switch(i) {
			case 1:
				//Print the Entire Contact List
				
				ContactPrintOut(Storage, ContactNum);
				
				
			case 2:
				//Contact Creation
				str = ContactItem.Creation();
				if(str != null)
					Storage[i] = str;
				ContactNum++;
				
				
			case 3:
				//Contact Editing
				
				ContactPrintOut(Storage, ContactNum);
				
				
				
				System.out.println("Which contact will you edit");
				i = sc.nextInt();
				if(IndexChecker(Storage, i)) {
					str = ContactItem.Editing(i);
					if(str != null)
						Storage[i] = str;
				}
				else
					System.out.println("Requested index does not exist");
				
			case 4:
				//Removal of a Contact entirely
				
				ContactPrintOut(Storage, ContactNum);
			
				System.out.println("Which contact will you remove? ");
				i = sc.nextInt();
				if(IndexChecker(Storage, i)) {
					Storage[i] = ContactItem.ContactRemoval(Storage, i);
					ContactNum--;
				}
				else
					System.out.println("Requested index does not exist");
				
			case 5:
				//Save the current list 
				//Writing everything to the in file
				i=0;
				try {
					FileWriter myWriter = new FileWriter(in);
					while(Storage[i] != null) {
						myWriter.write(Storage[i]);
						i++;
					}
					System.out.println("Successfully wrote to the file.");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			case 6:
				//Quitting back to ContactApp
				j++;
				break;
				
				
			default:
				System.out.println("Unknown Input, please enter a number");
				System.out.println("Error 001");
			}
		
		
		}
		
		
		
		
	}

	static boolean IndexChecker(String[] Storage, int i) {
		if(Storage[i] != null)
			return true;
		return false;
	}

	static boolean FileEmpty(File in) {
		if(in.length() != 0)
			return false;
		return true;		
	}

	private static void FileToRAM(String[] Storage, File in) throws FileNotFoundException {
		Scanner myReader = new Scanner(in);
	    int i=0;
		while (myReader.hasNextLine()) {
	        Storage[i] = myReader.nextLine();
	        i++;
	      }
		myReader.close();
	}
	
	private static int ContactPrintOut(String[] Storage, int ContactNum) {
		System.out.println("Current Contacts");
		System.out.println("----------------");
		System.out.println("");
		
		while(Storage[ContactNum] != null) {
			System.out.println(ContactNum);
			System.out.print(") ");
			System.out.print(Storage[ContactNum]);
			ContactNum++;
		}
		
		return ContactNum;		
	}

}
