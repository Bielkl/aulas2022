package estudos;

import java.util.Scanner;

public class despesas {

	public despesas() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual é a sua renda mensal ?");
		double renda = sc.nextDouble();

		System.out.println("Qual valor da conta de Agua?");
		double Agua = sc.nextDouble();

		System.out.println("Qual o valor da sua conta de Luz?");
		double Luz = sc.nextDouble();

		System.out.println("qual o valor da sua internet ?");
		double internet = sc.nextDouble();

		System.out.println("qual o valor da gasto no  Mercado?");
		double mercado = sc.nextDouble();

		double despesas = Agua + Luz + internet + mercado;
		System.out.println("O gasto mensal Informado é " + despesas);

		double divide = despesas - renda;

		if (despesas > renda) {
			System.out.println("Suas despesas essedeu o valor da renda");
		} else {
			System.out.println("Temos um pouco de dinheiro para guarda esse mes ");
			sc.close();

		}
	}
}