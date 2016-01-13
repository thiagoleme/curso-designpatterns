package br.com.trilha.java.cursodp.imposto;

import br.com.trilha.java.cursodp.Orcamento;

public abstract class TemplateDeImpostoCondicional implements Imposto {

	@Override
	public final double calcula(Orcamento orcamento) {
		if (isMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		} else {
			return minimaTaxacao(orcamento);
		}
	}

	protected abstract double minimaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract boolean isMaximaTaxacao(Orcamento orcamento);

}
