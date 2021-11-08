package conditionAssignment3;



import java.util.Scanner;

public class basic2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String letter;
		
		System.out.println("대문자 영어한글자를 입력하세요: ");
		letter = input.nextLine();
		
		String word;
		
		switch (letter) {
		case "A":
			word = "Excellent";
			break;
		case "B":
			word = "Good";
			break;
		case "C":
			word = "Usually";
			break;
		case "D":
			word = "Effort";
			break;
		case "F":
			word = "Failure";
			break;
		default:
			word = "error";
			break;	
	}	
		System.out.println(word);
	}
	
}
