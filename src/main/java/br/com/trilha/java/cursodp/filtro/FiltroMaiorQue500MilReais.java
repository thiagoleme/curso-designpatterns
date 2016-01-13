package br.com.trilha.java.cursodp.filtro;

import java.util.ArrayList;
import java.util.List;

import br.com.trilha.java.cursodp.Conta;

public class FiltroMaiorQue500MilReais extends Filtro {
	public FiltroMaiorQue500MilReais(Filtro outroFiltro) {
		super(outroFiltro);
	}

	public FiltroMaiorQue500MilReais() {
		super();
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<Conta>();
		for (Conta conta : contas) {
			if (conta.getSaldo() > 50000)
				filtrada.add(conta);
		}
		filtrada.addAll(proximo(contas));
		return filtrada;
	}
}