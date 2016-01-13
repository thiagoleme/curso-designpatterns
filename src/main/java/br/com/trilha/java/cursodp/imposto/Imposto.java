package br.com.trilha.java.cursodp.imposto;

import br.com.trilha.java.cursodp.Orcamento;

public abstract class Imposto {
	private final Imposto outroImposto;

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	public Imposto() {
		outroImposto = null;
	}

	protected double calculaOutroImposto(Orcamento orcamento) {
		return (outroImposto == null ? 0 : outroImposto.calcula(orcamento));
	}

	public abstract double calcula(Orcamento orcamento);
}
