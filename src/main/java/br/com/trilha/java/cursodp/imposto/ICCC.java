package br.com.trilha.java.cursodp.imposto;

import br.com.trilha.java.cursodp.Orcamento;

public class ICCC extends Imposto {

	public ICCC(Imposto imposto) {
		super(imposto);
	}

	public ICCC() {
		super();
	}

	@Override
	public double calcula(Orcamento orcamento) {
		double valorImposto = orcamento.getValor();
		if (orcamento.getValor() < 1000) {
			valorImposto *= 0.05;
		}
		if (orcamento.getValor() <= 3000) {
			valorImposto *= 0.07;
		} else {
			valorImposto = valorImposto * 0.08 + 30;
		}
		return valorImposto + calculaOutroImposto(orcamento);
	}

}
