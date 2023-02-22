package conditional_problems;

import java.util.Scanner;

public class VowlOrConsonent {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("please enter a letter");
		
		String letter = scanner.next();
		
		boolean uppercase = letter.charAt(0)>=65 && letter.charAt(0)<=90;
		boolean lowercase = letter.charAt(0)>=97 && letter.charAt(0)<=122;
		
		boolean vowels = letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u") ||
				letter.equals("A") || letter.equals("E") || letter.equals("I") || letter.equals("O") || letter.equals("U"); 
		
		if(!(uppercase || lowercase))
		{
			System.out.println("Error...... "+letter+" is not a letter");
		}
		else if(vowels)
		{
			System.out.println(letter +" is an vowel");
		}
		else
		{
			System.out.println(letter+" is a consonent");
		}
		scanner.close();
		

	}

}
