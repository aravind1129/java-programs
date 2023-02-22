package conditional_problems;

import java.util.Scanner;

public class calculateWeekDay {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter a number");
		int day = scanner.nextInt();
		switch (day) {
		case 1: System.out.println("monday");
		break;
		case 2: System.out.println("Tuesday");
		break;
		case 3: System.out.println("Wednesday");
		break;
		case 4: System.out.println("Thursday");
		break;
		case 5: System.out.println("Friday");
		break;
		case 6: System.out.println("saturday");
		break;
		case 7: System.out.println("sunday");
		break;
	
		default:
			throw new IllegalArgumentException("Unexpected value: " + day);
		}
		scanner.close();

	}

}
