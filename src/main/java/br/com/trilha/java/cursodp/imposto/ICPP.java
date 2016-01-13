package br.com.trilha.java.cursodp.imposto;

import br.com.trilha.java.cursodp.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional {

	public ICPP(Imposto imposto) {
		super(imposto);
	}

	public ICPP() {
		super();
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05 + calculaOutroImposto(orcamento);
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07 + calculaOutroImposto(orcamento);
	}

	@Override
	protected boolean isMaximaTaxacao(Orcamento orcamento) {
		if (orcamento.getValor() < 500)
			return false;
		else
			return true;
	}

}
