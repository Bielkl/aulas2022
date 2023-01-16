package churrasco;

import java.util.Scanner;

class calculo {

	public static void calcular() {
		Scanner sc = new Scanner(System.in);
		double P;
		P = 67.90;
		System.out.println("quantos kg foram comprado de picanha ");
		double qtKg1 = sc.nextDouble();
		float valor1 =0;
		System.out.println(P * qtKg1 == valor1);
        
		double C;
		C = 27.34;
		System.out.println("quantos kg foram comprado de Costela ");
		double qtKg2 = sc.nextDouble();
		float valor2 =0;
		System.out.println(C * qtKg2 == valor2);
      
		double A;
		A = 17.99;
		System.out.println("quantos kg foram comprado de Assinha de frango");
		double qtKg3 = sc.nextDouble();
		float valor3 =0;
		System.out.println(A * qtKg3 == valor3);
        
		double L;
		L = 20.99;
		System.out.println("quantos kg foram comprado de Linguça  ");
		double qtKg4 = sc.nextDouble();
		float valor4 =0;
		System.out.println(L * qtKg4 == valor4);

		double F;
		F = 32.99;
		System.out.println("quantos kg foram comprado de Fraldinha ");
		double qtKg5 = sc.nextDouble();
		float valor5 = 0;
		System.out.println(F * qtKg5 == valor5 );
		
		System.out.println(valor1+valor2+valor3+valor4+valor5);
		
		sc.close();
	}
}
