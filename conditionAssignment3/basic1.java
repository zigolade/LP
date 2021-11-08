package conditionAssignment3;


import java.util.Scanner;

public class basic1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		
		a = input.nextInt();
		
		if (a==0) {
			System.out.println("zero");
		}
		if (a>0) {
			System.out.println("plus");
		}
		if (a<0) {
			System.out.println("minus");
		}
	}
}
