package loopAssignment2;

//전체적으로 for 구문 이해가 너무 어렵네요 ㅠㅠ
import java.util.Scanner;


public class practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int n;
			
			System.out.println("자연수 입력하세요: ");
			n = sc.nextInt();
			int cnt = 0; //변수 개수
			int sum = 0; // 합
			for (int i=1; sum<n; i++ ) {
				if (i%2 ==1) {
					sum+=i;
					cnt++;
				}
			}
			System.out.printf("%d %d", cnt, sum); // %d 같은 서식 써서 변수를 넣기 용이하게 만든 출력문..이라고 한다.
		
	}
}
