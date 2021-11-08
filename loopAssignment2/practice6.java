package loopAssignment2;

import java.util.Scanner;

public class practice6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i =1; n*i<=100; i++) {
			System.out.print(n*i + " ");
			
			if ((n*i)%10 == 0) {
					break;
				}
		}
	}
}