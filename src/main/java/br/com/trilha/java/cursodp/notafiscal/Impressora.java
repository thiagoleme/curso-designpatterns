package br.com.trilha.java.cursodp.notafiscal;

public class Impressora implements AcoesNotaFiscal{

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Imprimindo NF");
	}

}
