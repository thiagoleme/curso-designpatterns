package br.com.trilha.java.cursodp.desconto;

import br.com.trilha.java.cursodp.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}
}
