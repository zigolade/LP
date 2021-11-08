package loopAssignment1;

import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.println("자연수 입력: ");
		num = sc.nextInt();
		
		int i = 1; // 반복시킬 횟수
		
		while (i != 11) {
			System.out.println(num * i);
			i++;
		}
	}
}