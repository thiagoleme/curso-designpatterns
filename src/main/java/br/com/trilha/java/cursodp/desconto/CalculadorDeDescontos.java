package br.com.trilha.java.cursodp.desconto;

import br.com.trilha.java.cursodp.Orcamento;

public class CalculadorDeDescontos {
	public double calcula(Orcamento orcamento) {
		Desconto desconto = new DescontoPorMaisDeCincoItens(
								new DescontoPorMaisDeQuinhentosReais(
										new DescontoPorVendaCasada(
												new SemDesconto())));
		return desconto.desconta(orcamento);
	}
}
