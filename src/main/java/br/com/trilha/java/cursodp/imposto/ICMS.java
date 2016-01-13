package br.com.trilha.java.cursodp.imposto;

import br.com.trilha.java.cursodp.Orcamento;

public class ICMS extends Imposto {

	public ICMS(Imposto imposto) {
		super(imposto);
	}

	public ICMS() {
		super();
	}

	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.05 + 50 + calculaOutroImposto(orcamento);
	}

}
