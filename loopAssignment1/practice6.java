package loopAssignment1;

import java.util.Scanner;

public class practice6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double len = 0;
		double hei = 0;
		double area;
		
		
		
		
		while (true) {
		System.out.println("Base?: ");
		len = sc.nextDouble();
		System.out.println("Height?: ");
		hei = sc.nextDouble();
		
		area = len * hei * 0.5;
		System.out.println("Triangle width = " + area);
		
		System.out.println("continue?: ");

		
			String ask = sc.next();
			 if (ask.equals("y") || ask.equals("Y")) {
				 continue;
			 }
			 else { System.out.println("end");
				 break;
			 }
		}
		
		
	}
}
