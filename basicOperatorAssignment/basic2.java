package basicOperatorAssignment;

import java.util.Scanner;

public class basic2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int c;
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		if (a > b) {
			if (a > c) {
				System.out.println(true);
			}
		}
		
		if (a == b) {
			if (b == c) {
				System.out.println(false);
			}
		}

	}
}
