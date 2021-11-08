package conditionAssignment3;

import java.util.Scanner;

public class basic5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sex;
		int age;
		String M = "M"; // equals 메소드 이용하려고 문자변수를 더 만들어봤다.
		String F = "F";
			
		
		System.out.println("성별을 M 혹은 F 로 입력하세요:");
		sex = input.nextLine();
		System.out.println("나이입력하세요: ");
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
			answer = "작동하지않네요.";
		}
		System.out.println(answer);
	}
}
//처음에 sex == "M" 이런식으로 조건문 넣었는데 잘 작동하지 않아서, equals()이 메소드를 이용하기로 했다.
// 여전히 작동하지 않는다. 왜지??