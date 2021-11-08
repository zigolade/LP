package assignment;

import java.util.Scanner;

public class basic5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a;
		
		
		
		System.out.println("yard? ");
		a = input.nextDouble();
		
		double b = a * 91.44;
		double c = Math.round(b * 10) / 10.0;
		
		System.out.println(a + "yard = " + c + "cm");
		
	}
	
	
		
			
}
