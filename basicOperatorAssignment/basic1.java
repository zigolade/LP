package basicOperatorAssignment;

import java.util.Scanner;

public class basic1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		
		a = input.nextInt();
		b = input.nextInt();
		
		System.out.println(a + " > " + b + " --- " + (a > b));
		System.out.println(a + " < " + b + " --- " + (a < b));
		System.out.println(a + " >= " + b + " --- " + (a >= b));
		System.out.println(a + " <= " + b + " --- " + (a <= b));
	}	
}
