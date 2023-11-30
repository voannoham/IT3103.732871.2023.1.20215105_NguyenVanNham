package ooplab1;
//Nguyen Van Nham 20215015
//ex 6.4 display the number of days of a month, which is entered by users 
import java.util.Scanner;
public class NumberOfDaysAMonth {
	public static void main(String arg[]) {
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("Nguyen Van Nham 5105 - enter month: ");
		int month = keyboard.nextInt();
		while (month < 1 || month > 12) {
			System.out.println("enter month again: ");
			month = keyboard.nextInt();
		}
		System.out.println("Nguyen Van Nham 5105 - enter year: ");
		int year = keyboard.nextInt();
		while (year <= 0) {
			System.out.println("enter year again: ");
			year = keyboard.nextInt();
		}	
		switch (month) {
			case 1: 
			case 3: 
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: System.out.println("31 days");
			break;
			case 2: if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
				          System.out.println("28 days");
					  }
			          else System.out.println("29 days");
			break;
			case 4:
			case 6:
			case 9:
			case 11: System.out.println("30 days");
			break;	
			default:
			break;
		}
	}
}

