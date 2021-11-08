package loopAssignment1;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.println("1~100사이의 정수 입력: ");
		num = sc.nextInt();
		
		int j = 0;
		
		while (num != 100) {
			j = j + num;
			num++;
		}
		System.out.println(j + 100);
	}
}
