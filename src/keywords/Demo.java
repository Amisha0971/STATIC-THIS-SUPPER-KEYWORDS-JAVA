package keywords;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in); // 'new' creates an object
	        System.out.println("Enter a number:");
	        int num = scanner.nextInt(); 
	        if (num % 2 == 0) { 
	            System.out.println("Even");
	        } else {
	            System.out.println("Odd");
	        }

	}

}
