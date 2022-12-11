package estudos;

public class carro {

	double combustivelGasto = 0;
	double totalKm = 0;
	double mediaLitro;

	public void calcularMediaLitroPorKm() {
		mediaLitro = totalKm / combustivelGasto;

	}
}