package conditionAssignment3;

import java.util.Scanner;

public class basic5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sex;
		int age;
		String M = "M"; // equals �޼ҵ� �̿��Ϸ��� ���ں����� �� �����ô�.
		String F = "F";
			
		
		System.out.println("������ M Ȥ�� F �� �Է��ϼ���:");
		sex = input.nextLine();
		System.out.println("�����Է��ϼ���: ");
		age = input.nextInt();
		
		String answer = "";
		
		
		if (sex.equals(M)) {
			if (age >= 18) {
				answer = "MAN";
			}
			else {
				answer = "BOY";
			}
		}
		if (sex.equals(F)) {
			if (age >= 18) {
				answer = "WOMAN";
			}
			else {
				answer = "GIRL";
			} 
		}
		else {
			answer = "�۵������ʳ׿�.";
		}
		System.out.println(answer);
	}
}
//ó���� sex == "M" �̷������� ���ǹ� �־��µ� �� �۵����� �ʾƼ�, equals()�� �޼ҵ带 �̿��ϱ�� �ߴ�.
// ������ �۵����� �ʴ´�. ����??