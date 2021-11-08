package assignment;

import java.util.Scanner;

public class basic4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				int x;
				int y;
				int z;
				int sum;
				int avg;
				
		System.out.println("첫번째숫자: ");
		x = input.nextInt();
		
		System.out.println("두번째숫자: ");
		y = input.nextInt();
		
		System.out.println("세번째숫자: ");
		z = input.nextInt();
		
		sum = x + y + z;
		avg = (x + y + z) / 3;
		
		System.out.println("sum = " + sum + "\n" + "avg = " + avg);
}
}
