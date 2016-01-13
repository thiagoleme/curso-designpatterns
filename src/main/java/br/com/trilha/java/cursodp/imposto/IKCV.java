package br.com.trilha.java.cursodp.imposto;

import br.com.trilha.java.cursodp.Item;
import br.com.trilha.java.cursodp.Orcamento;

public class IKCV extends TemplateDeImpostoCondicional {

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	public boolean isMaximaTaxacao(Orcamento orcamento) {
		if (orcamento.getValor() > 500 && temItemComValorMaior100(orcamento))
			return true;
		else
			return false;
	}

	private boolean temItemComValorMaior100(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100)
				return true;
		}
		return false;
	}

}
