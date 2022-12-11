package estudos;

import java.util.Scanner;

public class IMC {

	public IMC() {
		Scanner sc = new Scanner(System.in);
		double massa;
		double altura;
		double resultado;

		System.out.println("informe sua altura");
		altura = sc.nextDouble();
		System.out.println("informe seu peso");
		massa = sc.nextDouble();
		resultado = massa / (altura * altura);

		System.out.println("o seu imc é" + resultado);

		sc.close();
	}

}