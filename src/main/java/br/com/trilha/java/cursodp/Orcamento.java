package br.com.trilha.java.cursodp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	protected double valor;
	private List<Item> itens;
	protected EstadoDoOrcamento estadoDoOrcamento;

	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<>();
		estadoDoOrcamento = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}

	public EstadoDoOrcamento getEstadoDoOrcamento() {
		return estadoDoOrcamento;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void adicionaItem(Item item) {
		itens.add(item);
	}

	public boolean existe(String nomeDoItem) {
		for (Item item : this.getItens()) {
			if (item.getNome().equals(nomeDoItem))
				return true;
		}
		return false;
	}

	public void aplicaDescontoExtra() {
		estadoDoOrcamento.aplicaDescontoExtra(this);
	}

	public void aprova() {
		estadoDoOrcamento.aprova(this);
	}

	public void reprova() {
		estadoDoOrcamento.reprova(this);
	}

	public void finaliza() {
		estadoDoOrcamento.finaliza(this);
	}
}