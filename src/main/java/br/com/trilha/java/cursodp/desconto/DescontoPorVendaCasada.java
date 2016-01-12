package br.com.trilha.java.cursodp.desconto;

import br.com.trilha.java.cursodp.Orcamento;

public class DescontoPorVendaCasada implements Desconto {
	private Desconto proximo;

	public DescontoPorVendaCasada(Desconto proximo) {
		this.proximo = proximo;
	}

	@Override
	public double desconta(Orcamento orcamento) {
		if (orcamento.existe("LAPIS") && orcamento.existe("CANETA")) {
			return orcamento.getValor() * 0.05;
		} else {
			return proximo.desconta(orcamento);
		}
	}
}
