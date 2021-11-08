package conditionAssignment3;

import java.util.Scanner;

public class basic6 {

	public static void main(String[] args) {
		System.out.println("연도를 입력하시오.");
			Scanner sc = new Scanner(System.in);
			int year = sc.nextInt();
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) { 
				// 4로 나눈값이 0이 윤년. 100으로 나눈값이 0인건 제외. 400으로 나누값이 0인건 윤년
				System.out.println(year + "년은 윤년");
			}
			else {
			System.out.println(year + "년은 평년");
			}
	}
}