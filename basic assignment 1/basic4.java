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
				
		System.out.println("ù��°����: ");
		x = input.nextInt();
		
		System.out.println("�ι�°����: ");
		y = input.nextInt();
		
		System.out.println("����°����: ");
		z = input.nextInt();
		
		sum = x + y + z;
		avg = (x + y + z) / 3;
		
		System.out.println("sum = " + sum + "\n" + "avg = " + avg);
}
}
