package conditionAssignment3;

import java.util.Scanner;

public class basic4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		
		num = input.nextInt();
		
		int days;
		
		switch (num) {
		case 2:
			days = 28;
			break;
		case 4:
			days = 30;
			break;
		case 6:
			days = 30;
			break;
		case 9:
			days = 30;
			break;
		case 11:
			days = 30;
			break;
		default:
			days = 31;
			break;
		}
		System.out.println(days);
			
	}
}
