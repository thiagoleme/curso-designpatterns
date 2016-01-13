package br.com.trilha.java.cursodp.notafiscal;

public class EnviadorDeEmail implements AcoesNotaFiscal{

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("E-mail enviado!");
	}

}
