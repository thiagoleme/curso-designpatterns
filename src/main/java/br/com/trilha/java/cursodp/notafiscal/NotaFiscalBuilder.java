package br.com.trilha.java.cursodp.notafiscal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {
	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> itens = new ArrayList<>();
	private double valorBruto = 0;
	private double impostos;
	private String observacoes;
	private Calendar dataEmissao;
	private List<AcoesNotaFiscal> acoesNotaFiscal = new ArrayList<>();

	public NotaFiscalBuilder(List<AcoesNotaFiscal> acoesNotaFiscal) {
		this.dataEmissao = Calendar.getInstance();
		this.acoesNotaFiscal = acoesNotaFiscal;
	}

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}

	public NotaFiscalBuilder comItem(ItemDaNota item) {
		this.itens.add(item);
		valorBruto += item.getValor();
		return this;
	}

	public NotaFiscalBuilder naData(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
		return this;
	}

	public NotaFiscal constroi() {
		NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, dataEmissao, valorBruto, impostos, itens,
				observacoes);
		for (AcoesNotaFiscal acao : acoesNotaFiscal) {
			acao.executa(notaFiscal);
		}
		return notaFiscal;
	}

}
