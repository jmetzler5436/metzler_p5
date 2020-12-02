package metzler_p5;

import java.util.Scanner;

public class TaskItem {

	@SuppressWarnings("resource")
	public static String Creation() {
		Scanner sc = new Scanner(System.in);
		String end;
		int arr[] = new int[4];
		String title, desc, dueDate;
		
		
		System.out.print(System.lineSeparator());
		System.out.print("Task title: ");
		title = sc.nextLine();
		arr[0] = ValidityChecker(title);
		
		System.out.print("Task description: ");
		desc = sc.nextLine();
		arr[1] = ValidityChecker(desc);
		
		System.out.print("Task due date (YYYY-MM-DD): ");
		dueDate = sc.nextLine();
		arr[2] = ValidityChecker(dueDate);
				
		end = "[" + dueDate + "] " + title + ": " + desc;
			
		
		
		if(arr[0] == 1) {
			System.out.println("Title entered incorrectly");
			System.out.println("Error 201");
			return null;
		}
		else if(arr[1] == 1) {
			System.out.println("Description entered incorrectly");
			System.out.println("Error 202");
			return null;
		}
		else if(arr[2] == 1) {
			System.out.println("Due Date entered incorrectly");
			System.out.println("Error 203");
			return null;
		}
		else if(arr[0] == 1 && arr[1] == 1 && arr[2] == 1) {
			System.out.println("All Data is Empty");
			System.out.println("Error 204");
			return null;
		}
		else {
			System.out.println("Task created successfully");
			return end;
		}
	}	
	
	@SuppressWarnings("resource")
	public static String Editing(int taskNum) {
		Scanner sc = new Scanner(System.in);
		String end;
		int arr[] = new int[4];
		String title, desc, dueDate;
		
		
		System.out.print(System.lineSeparator());
		System.out.print("Enter a new title for task ");
		System.out.print(taskNum);
		System.out.print(": ");
		title = sc.nextLine();
		arr[0] = ValidityChecker(title);
		
		System.out.print("Enter a new description for task ");
		System.out.print(taskNum);
		System.out.print(": ");
		desc = sc.nextLine();
		arr[1] = ValidityChecker(desc);
		
		System.out.print("Enter a new task due date (YYYY-MM-DD) for task ");
		System.out.print(taskNum);
		System.out.print(": ");
		dueDate = sc.nextLine();
		arr[2] = ValidityChecker(dueDate);
				
		end = "[" + dueDate + "] " + title + ": " + desc;
				
		
		if(arr[0] == 1 && arr[1] == 1 && arr[2] == 1) {
			System.out.println("All Data is Empty");
			System.out.println("Error 254");
			return null;
		}
		else if(arr[0] == 1) {
			System.out.println("Title entered incorrectly");
			System.out.println("Error 251");
			return null;
		}
		else if(arr[1] == 1) {
			System.out.println("Description entered incorrectly");
			System.out.println("Error 252");
			return null;
		}
		else if(arr[2] == 1) {
			System.out.println("Due Date entered incorrectly");
			System.out.println("Error 253");
			return null;
		}
		else {
			System.out.println("Task edited successfully");
			return end;
		}
		
	}	
	
	private static int ValidityChecker(String input) {
		if(input.length() == 0) 
			return 1;
		else		
			return 0;
	}
	
	public static String Completion(String str) {
		String result = null;
		String Congrats = "*** ";
		result = Congrats.concat(str);
		return result;
	}
	
	public static String Incomplete(String str) {
		String result = null;
		result = str.substring(4, str.length());
		return result;
	}

	public static String TaskRemoval(String[] Storage, int i) {
		if(Storage[i] == null)
			return Storage[i];
		
		return null;
	}
}
