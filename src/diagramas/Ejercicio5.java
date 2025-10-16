package diagramas;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduce num");
		num = sc.nextInt();
		
		if (num >= 0) {
			System.out.println(num + " es positivo");
		} else {
			System.out.println(num + " es negativo");
		}
		
		sc.close();
	}

}
