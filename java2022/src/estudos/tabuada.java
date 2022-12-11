package estudos;

import java.util.Scanner;

public class tabuada {

	public static void man(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("qual tabuada voce deseja saber");
		int tabuada = sc.nextInt();
		int i = 0;

		do {
			System.out.println(tabuada + "x" + i + " =" + (tabuada * i));
			i++;
		} while (i < 11);
	}
}
