package estudos;

import java.util.Scanner;

public class idades {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idade;
		System.out.println("ola me informe sua idade");
		idade = sc.nextInt();

		if (idade >= 18) {
			System.out.println("Voce  é maior de idade " + idade);
		} else
			System.out.println("voce  nao é menor de idade  " + idade);

		sc.close();
	}
}
