package basicOperatorAssignment;

import java.util.Scanner;

public class basic4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int MH; // ¹Î¼öÅ°
		int MW;  // ¹Î¼ö ¸ö¹«°Ô
		int GH; // ±â¿µÅ°
		int GW; // ±â¿µ ¸ö¹«°Ô
		
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