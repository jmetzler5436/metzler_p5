package metzler_p5;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	void main() throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int i=0, j=0;
		
		
		System.out.printf("Which App do you wish to access:");
		System.out.printf("-=-=-=-=-=-=-=-");
		System.out.printf("1) Contact List");
		System.out.printf("2) Task List");
		System.out.printf("3) Exit");
		System.out.printf("");
		System.out.printf("> ");
			
		while(j==0) {
			i = sc.nextInt();
		
			switch(i) {
			case 1:
				ContactApp.main();				
			case 2:
				TaskApp.main();
			case 3:
				sc.close();
				System.out.println("Process finished with exit code 0");
				System.exit(0);
			}
		}
	}
}
