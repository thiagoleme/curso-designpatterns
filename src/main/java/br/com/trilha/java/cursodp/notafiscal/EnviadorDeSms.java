package br.com.trilha.java.cursodp.notafiscal;

public class EnviadorDeSms implements AcoesNotaFiscal{

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Enviando SMS");
	}

}
