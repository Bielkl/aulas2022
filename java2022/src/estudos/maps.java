package estudos;

import java.util.Scanner;

public class maps {

	public static void main(String[] argas) {
		Scanner sc = new Scanner(System.in);
		int ruas = 0, km = 0, passos = 0;

		System.out.println("Informe a quantidades de rua ate o Destino");
		ruas = sc.nextInt();
		for (int i = 0; i < ruas; i++) {
			System.out.println("ruas " + i);
			km = sc.nextInt();
			passos += km;

		}
		System.out.println("km ate chegar la " + passos);

		sc.close();
	}
}
