package br.com.trilha.java.cursodp.imposto;

import br.com.trilha.java.cursodp.Orcamento;

public class ISS extends Imposto {

	public ISS(Imposto imposto) {
		super(imposto);
	}

	public ISS() {
		super();
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculaOutroImposto(orcamento);
	}

}
