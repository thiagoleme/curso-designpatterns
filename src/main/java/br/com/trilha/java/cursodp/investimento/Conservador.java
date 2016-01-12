package br.com.trilha.java.cursodp.investimento;

import br.com.trilha.java.cursodp.Conta;

public class Conservador implements Investimento{

	@Override
	public double calcula(Conta conta) {
		return conta.getSaldo() * 0.008;
	}

}
