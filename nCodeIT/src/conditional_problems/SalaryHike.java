package conditional_problems;

import java.util.Scanner;

public class SalaryHike {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter your years of service");
		int years = scanner.nextInt();
		
		if(years>=5)
		{
			System.out.println("congrats.... Yor are eligible for Bonus");
			System.out.println("please enter net salary");
			int salary = scanner.nextInt();
			System.out.println("After bonus your salary is "+(salary+(salary*0.05)));
		}
		else
		{
			System.out.println("opps! Sorry ...,,,You are not eligible for bonus");
		}
		scanner.close();

	}

}
