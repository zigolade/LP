package loopAssignment2;


import java.util.Scanner;

// �� ���� �ٽ� ���鼭 ������. �и� ��ĥ�ڿ� ���� ���� ���ظ���
public class practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a>b) {
				for (int i =1; i <= 9; i++) {
					for (int j = a; j>=b; j--) {
						System.out.printf("%d * %d = %2d  ", j,i,j*i);
					}
					System.out.println();
				}
			}
			else {
				for (int i =1; i<=9;i++) {
					for (int j =a; j<=b;j++) {
						System.out.printf("%d * %d = %2d   ", j,i,j*i);
					}
					System.out.println();
				} 
			}
	}
}