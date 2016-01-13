package br.com.trilha.java.cursodp;

import java.util.ArrayList;
import java.util.List;

import br.com.trilha.java.cursodp.imposto.TemplateDeImpostoCondicional;

public class IHIT extends TemplateDeImpostoCondicional {

	@Override
	public boolean isMaximaTaxacao(Orcamento orcamento) {
		List<String> noOrcamento = new ArrayList<String>();

		for (Item item : orcamento.getItens()) {
			if (noOrcamento.contains(item.getNome()))
				return true;
			else
				noOrcamento.add(item.getNome());
		}

		return false;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (0.01 * orcamento.getItens().size());
	}
}