package loopAssignment1;


import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("1~100사이의 정수 입력: ");
		num = sc.nextInt();
	
		int i = 0;
		int j = 0;
		
		while (i < num) {
			j = j + i;
//			System.out.println(j);
			i++;
		}
		System.out.println(j + num);
	}
}
