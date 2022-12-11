package estudos;

public class PecaTeste {

	public static void main(String[] args) {
		peca peca = new peca();
		peca.nome = "bispo";
		peca.posicaoAtualLetra = 'f';
		peca.posicaoAtualNumero = 6;

		peca.validarMovimento('b', (byte) 2);
		peca.validarMovimento('b', (byte) 3);

		peca.posicaoAtualLetra = 'c';
		peca.posicaoAtualNumero = 7;
		peca.validarMovimento('g', (byte) 3);
		peca.validarMovimento('g', (byte) 1);

//		peca.validarMovimento('a', (byte) 8);
//		peca.validarMovimento('d', (byte) 6);
//		peca peca = new peca();
//		peca.nome = "torre";
//		peca.posicaoAtualLetra = 'h';
//		peca.posicaoAtualNumero = 8;
//		
//		peca.validarMovimento('h', (byte) 1);
//		peca.validarMovimento('a', (byte) 8);
//		peca.validarMovimento('d', (byte) 6);
	}
}
