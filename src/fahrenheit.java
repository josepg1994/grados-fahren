package pasargrados;

import java.util.Scanner;

public class fahrenheit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("introduzca un numero");
		int c = sc.nextInt();
		int f = c*(9/5)+32;
		System.out.println(c+" grados son "+f+" grados fahrenheit");
		
sc.close();
	}

}
