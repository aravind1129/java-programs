package conditional_problems;

import java.util.Scanner;

public class NTermsOfNaturalNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter a number");
		int size = scanner.nextInt();
		int sum = 0;
		
		
		for(int i=1 ; i<=size ;i++)
		{
			sum+=i;
			
		}
		System.out.println("sum of natural number upto "+size+" is "+sum);
		scanner.close();

	}

}
