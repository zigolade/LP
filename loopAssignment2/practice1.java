package loopAssignment2;

//��ü������ for ���� ���ذ� �ʹ� ��Ƴ׿� �Ф�
import java.util.Scanner;


public class practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int n;
			
			System.out.println("�ڿ��� �Է��ϼ���: ");
			n = sc.nextInt();
			int cnt = 0; //���� ����
			int sum = 0; // ��
			for (int i=1; sum<n; i++ ) {
				if (i%2 ==1) {
					sum+=i;
					cnt++;
				}
			}
			System.out.printf("%d %d", cnt, sum); // %d ���� ���� �Ἥ ������ �ֱ� �����ϰ� ���� ��¹�..�̶�� �Ѵ�.
		
	}
}
