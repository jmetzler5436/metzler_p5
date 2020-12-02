package metzler_p5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TaskList {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(File in) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int i=0, j=0, k=0;
		String Storage[] = new String[20];
		String str = null;
		int TaskNum = 0;
		
		if(FileEmpty(in));	
		
		else		
			FileToRAM(Storage, in);
		
		while(j==0) {
			System.out.printf("");
			System.out.printf("Task List Operations");
			System.out.printf("=======================");
			System.out.printf("");
			System.out.printf("1) view the list");
			System.out.printf("2) add an item");
			System.out.printf("3) edit an item");
			System.out.printf("4) remove an item");
			System.out.printf("5) mark an item as completed");
			System.out.printf("6) unmark an item as completed");
			System.out.printf("5) save the current list");
			System.out.printf("6) quit to the main menu");
		
			i = sc.nextInt();
			
			switch(i) {
			case 1:
				//Print the Entire Task List

				TaskPrintOut(Storage);
				
				
			case 2:
				//Task Creation
				str = TaskItem.Creation();
				if(str != null)
					Storage[i] = str;
				TaskNum++;
				
				
			case 3:
				//Task Editing
				
				TaskPrintOut(Storage);
				
				System.out.println("Which task will you edit: ");
				i = sc.nextInt();
				
				str = TaskItem.Editing(i);
				if(str != null)
					Storage[i] = str;
				TaskNum++;
				
				System.out.println("Which task will you edit");
				i = sc.nextInt();
				if(IndexChecker(Storage, i)) {
					str = TaskItem.Editing(i);
					if(str != null)
						Storage[i] = str;
				}
				else
					System.out.println("Requested index does not exist");
				
				
			case 4:
				//Removal of a Task entirely
				TaskPrintOut(Storage);
				
				System.out.println("Which task will you remove? ");
				i = sc.nextInt();
				if(IndexChecker(Storage, i)) {
					Storage[i] = TaskItem.TaskRemoval(Storage, i);
					TaskNum--;
				}
				else
					System.out.println("Requested index does not exist");
				
			case 5:
				//Mark Completion
				TaskPrintOut(Storage);
				
				if(IndexChecker(Storage, i)) {
					System.out.println("Which task will you mark as completed? ");
					i = sc.nextInt();
				
					Storage[i] = TaskItem.Completion(Storage[i]);
				}
				else
					System.out.println("Requested index does not exist");
				
			case 6:
				//Unmark Completion
				TaskPrintOut(Storage);
				
				if(IndexChecker(Storage, i)) {
					System.out.println("Which task will you unmark as completed? ");
					i = sc.nextInt();
				
					Storage[i] = TaskItem.Incomplete(Storage[i]);
				}
				else
					System.out.println("Requested index does not exist");
				
				
			case 7:
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
				
			case 8:
				//Quitting back to TaskApp
				break;
				
				
			default:
				System.out.printf("Unknown Input, please enter a number");
				System.out.println("Error 001");
			}
		
		
		}
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
	
	static boolean IndexChecker(String[] Storage, int i) {
		if(Storage[i] != null)
			return true;
		return false;
	}

	private static void TaskPrintOut(String[] Storage) {
		int i=0;
		
		System.out.println("Current Tasks");
		System.out.println("-------------");
		System.out.println("");
		
		while(Storage[i] != null) {
			System.out.println(i);
			System.out.print(") ");
			System.out.print(Storage[i]);
			i++;
		}
		
	}
}
