package conditionAssignment3;

import java.util.Scanner;

public class basic3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			int num;
			
			System.out.print("Number? ");
			num = input.nextInt();
			
			
			String animal;
			
			switch (num) {
			case 1:
				animal = "dog";
				break;
			case 2:
				animal = "cat";
				break;
			case 3:
				animal = "chick";
				break;
			default:
				animal = "I don't know";
				break;
			}
	System.out.println(animal);
	}
}
