package lista04;

import java.util.Scanner;

public class exercicio22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Valor x");
		int x = sc.nextInt();
		System.out.println("Valor y");
		int y = sc.nextInt();
		
		int z = (x * y) + 5;
		System.out.println("Z = " + z);
	}


}
