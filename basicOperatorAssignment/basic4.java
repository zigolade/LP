package basicOperatorAssignment;

import java.util.Scanner;

public class basic4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int MH; // �μ�Ű
		int MW;  // �μ� ������
		int GH; // �⿵Ű
		int GW; // �⿵ ������
		
		MH = input.nextInt();
		MW = input.nextInt();
		GH = input.nextInt();
		GW = input.nextInt();
		
		if (MH > GH) {
			if (MW > GW) {
				System.out.println(true);
			}
		}
		else System.out.println(false);
	}
}