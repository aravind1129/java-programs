package conditional_problems;

import java.util.Scanner;

public class PrintTrainglePattren {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter a number");
		int rows = scanner.nextInt();
		
		for(int i=1 ; i<=rows ; i++)
		{
			for(int j=1 ; j<=i ;j++ )
			{
				System.out.print(j);
			}
			System.out.println();
		}
		scanner.close();
				
		

	}

}
