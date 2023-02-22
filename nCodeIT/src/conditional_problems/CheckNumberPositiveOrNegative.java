package conditional_problems;

import java.util.Scanner;

public class CheckNumberPositiveOrNegative {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int num = scanner.nextInt();
		
		if(num>0)
		{
			System.out.println(num+" is a positive number");
		}
		else
		{
			System.out.println(num+" is a negative Number");
		}
		scanner.close();
	}

}
