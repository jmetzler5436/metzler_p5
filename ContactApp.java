package metzler_p5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContactApp {

	@SuppressWarnings({ "unused", "resource" })
	public static void main() throws FileNotFoundException {
		File in;
		Scanner sc = new Scanner(System.in);
		int i=0, j=0, k=0;
		String str;
		
		System.out.printf("");
		System.out.printf("Contact List Creation & Loading");
		System.out.printf("=======================");
		System.out.printf("");
		System.out.printf("1) create a new list");
		System.out.printf("2) load an existing list");
		System.out.printf("3) quit back to main menu");
		System.out.printf("");
		System.out.printf("> ");
		
		
		
		while(j==0) {
			i = sc.nextInt();
			System.out.printf("");
			
			switch(i) {
			case 1:
				System.out.printf("new contact list has been created");
				in = new File("filename.txt");
				ContactList.main(in);
			case 2:
				System.out.printf("Enter the filename to load:");
				str = sc.nextLine();
				in = new File(str);
				
				k = LoadCheck(in);
				
				if(k==0) {
					System.out.printf("contact list has been loaded");
					ContactList.main(in);
				}
				else
					System.out.println("Nothing was loaded");
			case 3:
				break;
			default:
				System.out.printf("Input a number from the list please");
			}
			
		
		}
		
	}
	
	static int LoadCheck(File in) {
		if(in.length() == 0)
			return 1;		
		return 0;
	}	

}
