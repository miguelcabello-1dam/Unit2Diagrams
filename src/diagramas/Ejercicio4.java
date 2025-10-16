package diagramas;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("Introduce num1");
		num1 = sc.nextInt();
		System.out.println("Introduce num2");
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + " es el mayor");
		} else if (num2 > num1) {
			System.out.println(num2 + " es el mayor");
		} else {
			System.out.println("ambos son iguales");
		}
		
		sc.close();
	}

}
