package conditional_problems;

import java.util.Scanner;

public class NoOfDaysInMonth {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String monthName;
		int noOfDays;
	
		System.out.println("Please enter a month");
		int month = scanner.nextInt();
		System.out.println("Please enter a year");
		int year = scanner.nextInt();

		switch (month) {
		case 1: {
			monthName = "January";
			noOfDays = 31;
			break;
		}
		case 2: {
			monthName = "Feb";
			if((year%400 ==0) ||(( year%4 ==0) && (year%100 !=0)))
			noOfDays = 29;
			else
				noOfDays = 28; 
			break;
		}
		case 3: {
			monthName = "Mar";
			noOfDays = 31;
			break;
		}
		case 4: {
			monthName = "April";
			noOfDays = 30;
			break;
		}
		case 5: {
			monthName = "May";
			noOfDays = 31;
			break;
		}
		case 6: {
			monthName = "June";
			noOfDays = 30;
			break;
		}
		case 7: {
			monthName = "July";
			noOfDays = 31;
			break;
		}
		case 8: {
			monthName = "Aug";
			noOfDays = 31;
			break;
		}
		case 9: {
			monthName = "Sep";
			noOfDays = 30;
			break;
		}
		case 10: {
			monthName = "Oct";
			noOfDays = 31;
			break;
		}
		case 11: {
			monthName = "Nov";
			noOfDays = 30;
			break;
		}
		case 12: {
			monthName = "Dec";
			noOfDays = 31;
			break;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + month);
			
		}
		System.out.println(month+" of "+year+" has month name is "+ monthName+" and no of days are "+noOfDays );
		scanner.close();
	
	}
	

}
