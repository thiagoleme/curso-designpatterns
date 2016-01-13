package br.com.trilha.java.cursodp.imposto;

import br.com.trilha.java.cursodp.Orcamento;

public class ImpostoMuitoAlto extends Imposto {

	public ImpostoMuitoAlto(Imposto imposto) {
		super(imposto);
	}

	public ImpostoMuitoAlto() {
		super();
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.2 + calculaOutroImposto(orcamento);
	}

}
