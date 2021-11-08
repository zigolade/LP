package basicOperatorAssignment;

import java.util.Scanner;

public class basic3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		
		a = input.nextInt();
		b = input.nextInt();
		
		int nexta = a++;
		int nextb = --b;
		
		System.out.println(nexta); //예시처럼 11이 안뜨는데...? 잘 모르겟습니다.
		System.out.println(nextb);
		System.out.println(nexta * nextb);
	}
}