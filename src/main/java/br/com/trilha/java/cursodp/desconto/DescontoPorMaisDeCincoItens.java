package br.com.trilha.java.cursodp.desconto;

import br.com.trilha.java.cursodp.Orcamento;

public class DescontoPorMaisDeCincoItens implements Desconto {
	private Desconto proximo;

	public DescontoPorMaisDeCincoItens(Desconto proximo) {
		this.proximo = proximo;
	}

	@Override
	public double desconta(Orcamento orcamento) {
		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		} else {
			return proximo.desconta(orcamento);
		}
	}

}
