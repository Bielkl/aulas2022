package estudos;

public class fiat {

	public static void main(String[] args) {

		carro festback = new carro();
		festback.combustivelGasto = 3;
		festback.totalKm = 30;

		festback.calcularMediaLitroPorKm();
		System.out.println("media de gasto fiat festback" + festback.mediaLitro);

		carro argo = new carro();
		argo.combustivelGasto = 2;
		argo.totalKm = 30;

		argo.calcularMediaLitroPorKm();
		System.out.println("media de gasto fiat argo " + " " + argo.mediaLitro);

	}

}
