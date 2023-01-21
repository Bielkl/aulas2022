package churrasco;

import java.util.Scanner;

public class menuopcao {

	Scanner sc = new Scanner(System.in);

	public static void menuopcao() {
		
		System.out.println("escolha uma das opcao");
		System.out.println("01  calcular");
		System.out.println("02 para kg");
		System.out.println("0  sair");
		

	}
		

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcaoEscolhida = -1;
		menuopcao();

		while (opcaoEscolhida != 0) {

			opcaoEscolhida = sc.nextInt();

			switch (opcaoEscolhida) {
			case 1:
				calculo.calcular();
				break;
			case 2:Calculokg.kgGrama();
                  break;
			case 3:

				break;
			case 4:
				
				break;

			default:
				System.out.println("digite um numero valido" + opcaoEscolhida);
				break;
			}
		
		}

	}

}
