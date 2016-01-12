package br.com.trilha.java.cursodp.desconto;

import br.com.trilha.java.cursodp.Orcamento;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {
	private Desconto proximo;

	public DescontoPorMaisDeQuinhentosReais(Desconto proximo) {
		this.proximo = proximo;
	}

	@Override
	public double desconta(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		} else {
			return proximo.desconta(orcamento);
		}
	}
}
