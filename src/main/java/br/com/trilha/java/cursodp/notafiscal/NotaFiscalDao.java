package br.com.trilha.java.cursodp.notafiscal;

public class NotaFiscalDao implements AcoesNotaFiscal {

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Salvou no Banco!");
	}

}
