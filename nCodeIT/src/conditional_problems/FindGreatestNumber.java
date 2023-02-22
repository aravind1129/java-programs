package conditional_problems;

import java.util.Scanner;

public class FindGreatestNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter three numbers to find the greatest number");
		System.out.println("please enter first number");
		int firstNumber = scanner.nextInt();
		System.out.println("please enter Second number");
		int secondNumber = scanner.nextInt();
		System.out.println("please enter thrid number");
		int thridNumber = scanner.nextInt();
		
		if(firstNumber>secondNumber && firstNumber>thridNumber)
		{
			System.out.println(firstNumber+" is a greatest number");
		}
		else if(secondNumber>thridNumber)
		{
			System.out.println(secondNumber+" is a greatest number");
		}
		else
		{
			System.out.println(thridNumber+" is a greatest number");
		}

		scanner.close();
	}

}
