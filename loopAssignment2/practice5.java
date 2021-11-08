package loopAssignment2;

import java.util.Scanner;

public class practice5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i =1; i<=n; i++) {
			for(int j =(2*n-1); j>=i; j--) {
				if(i+j<=2*n) {
					System.out.print("*");					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
	}
}
}
