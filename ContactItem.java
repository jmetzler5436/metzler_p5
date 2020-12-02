package metzler_p5;

import java.util.Scanner;

public class ContactItem {

	@SuppressWarnings({ "unused", "resource" })
	public static String Creation() {
		Scanner sc = new Scanner(System.in);
		String end;
		int i=0;
		int arr[] = new int[4];
		String firstName, lastName, phoneNum, eMail;
		
		
		
		System.out.print(System.lineSeparator());
		System.out.print("First name: ");
		firstName = sc.nextLine();
		arr[0] = LengthChecker(firstName);
		
		System.out.print("Last name: ");
		lastName = sc.nextLine();
		arr[1] = LengthChecker(lastName);
		
		System.out.print("Phone number (xxx-xxx-xxxx): ");
		phoneNum = sc.nextLine();
		arr[2] = LengthChecker(phoneNum);
		
		System.out.print("Email address (x@y.z): ");
		eMail = sc.nextLine();		
		arr[3] = LengthChecker(eMail);
		
		end = firstName + " : " + lastName + " : " + phoneNum + " : " + eMail;
				
		
		if(arr[0]==0 || arr[1]==0 || arr[2]==0 || arr[3]==0) {
			System.out.println("Contact created successfully");
			return end;
		}
		else {
			System.out.println("Input Empty, Contact not Made.");
			System.out.println("Error 301");
			return null;
		}
	}

	

	@SuppressWarnings({ "unused", "resource" })
	public static String Editing(int index) {
		Scanner sc = new Scanner(System.in);
		String end;
		int i=0;
		int arr[] = new int[4];
		String firstName, lastName, phoneNum, eMail;
		
		
		
		System.out.print(System.lineSeparator());
		System.out.print("Enter a new first name for contact ");
		System.out.print(index);
		System.out.print(": ");
		firstName = sc.nextLine();
		arr[0] = LengthChecker(firstName);
		
		System.out.print("Enter a new last name for contact ");
		System.out.print(index);
		System.out.print(": ");
		lastName = sc.nextLine();
		arr[1] = LengthChecker(lastName);
		
		System.out.print("Enter a new phone number (xxx-xxx-xxxx) for contact ");
		System.out.print(index);
		System.out.print(": ");
		phoneNum = sc.nextLine();
		arr[2] = LengthChecker(phoneNum);
		
		System.out.print("Enter a new email address (x@y.z) for contact ");
		System.out.print(index);
		System.out.print(": ");
		eMail = sc.nextLine();		
		arr[3] = LengthChecker(eMail);
		
		end = firstName + " : " + lastName + " : " + phoneNum + " : " + eMail;
				
		
		if(arr[0]==0 || arr[1]==0 || arr[2]==0 || arr[3]==0) {
			System.out.println("Contact edited successfully");
			return end;
		}
		else {
			System.out.println("Input Empty, Contact not Made.");
			System.out.println("Error 302");
			return null;
		}
		
	}
	
	private static int LengthChecker(String input) {
		if(input.length() == 0) 
			return 1;
		else		
			return 0;
	}



	public static String ContactRemoval(String[] Storage, int i) {
		if(Storage[i] == null)
			return Storage[i];
		
		return null;
			
		
		
	}

}
