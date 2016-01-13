package br.com.trilha.java.cursodp;

import br.com.trilha.java.cursodp.notafiscal.AcoesNotaFiscal;
import br.com.trilha.java.cursodp.notafiscal.NotaFiscal;

public class Multiplicador implements AcoesNotaFiscal {
	private double fator;

	public Multiplicador(double fator) {
		this.fator = fator;
	}

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println(notaFiscal.getValorBruto() * fator);
	}

}
