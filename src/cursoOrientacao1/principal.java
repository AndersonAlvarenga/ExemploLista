package cursoOrientacao1;

import java.util.Scanner;


import tringulo.base;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com as medidas do tri�ngulo");
		base x = new base();
		base y = new base();
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.printf("A �rea do tringulo x � %.2f%n", x.area());
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		System.out.printf("A �rea do tringulo x � %.2f%n", y.area());
		if(x.area()<y.area()) {
			System.out.println("O triangulo Y � o maior");
		}else {
			System.out.println("O triangulo X � o maior");
		}
		sc.close();
	}

}
