package conditional_problems;

import java.util.Scanner;

public class MultificationTable {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter a number to find the multification table");
		int tableNo = scanner.nextInt();
		
		for(int i=1 ; i<=10 ; i++)
		{
			System.out.println(tableNo+" * "+i+" = "+tableNo*i);
		}
		scanner.close();

	}

}
