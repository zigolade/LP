package loopAssignment1;

import java.util.Scanner;

public class practice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		
		int i = 0; // ��������� �� '������ ����'
		
		while (num != 0) {
			System.out.println("�ڿ��� �Է�: ");
			num = sc.nextInt();
			if ((num % 3 != 0) && (num % 5 != 0)) {
				i++;
			}
			
		}
		System.out.println(i);
	}
}