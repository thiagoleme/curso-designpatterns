package br.com.trilha.java.cursodp.notafiscal;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {
	private String razaoSocial;
	private String cnpj;
	private double valorBruto;
	private Calendar dataEmissao;
	private double impostos;
	public String observacoes;
	public List<ItemDaNota> itens;

	public NotaFiscal(String razaoSocial, String cnpj, Calendar dataEmissao, double valorBruto, double impostos,
			List<ItemDaNota> itens, String observacoes) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.dataEmissao = dataEmissao;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.itens = itens;
		this.observacoes = observacoes;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public Calendar getDataEmissao() {
		return dataEmissao;
	}

	public double getImpostos() {
		return impostos;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public List<ItemDaNota> getItens() {
		return itens;
	}

}
