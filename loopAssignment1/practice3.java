package loopAssignment1;

import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.println("�ڿ��� �Է�: ");
		num = sc.nextInt();
		
		int i = 1; // �ݺ���ų Ƚ��
		
		while (i != 11) {
			System.out.println(num * i);
			i++;
		}
	}
}