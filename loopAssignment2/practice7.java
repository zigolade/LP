package loopAssignment2;

import java.util.Scanner;

public class practice7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int a = sc.nextInt();
		
		for (int i =0; i<a; i++) {
			int b = 1;
			
			for(int j =0; j < a-1-i; j++) {
				System.out.print("  "); // 두칸을 출력해서 공간을 만든다.
			}
			for(int j =0; j < i+1; j++) {
				System.out.print(b++ + " ");
			}
			System.out.println();
			}
	}
}
