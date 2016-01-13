package br.com.trilha.java.cursodp;

import java.util.ArrayList;
import java.util.List;

import br.com.trilha.java.cursodp.notafiscal.AcoesNotaFiscal;
import br.com.trilha.java.cursodp.notafiscal.EnviadorDeEmail;
import br.com.trilha.java.cursodp.notafiscal.EnviadorDeSms;
import br.com.trilha.java.cursodp.notafiscal.Impressora;
import br.com.trilha.java.cursodp.notafiscal.ItemDaNota;
import br.com.trilha.java.cursodp.notafiscal.NotaFiscal;
import br.com.trilha.java.cursodp.notafiscal.NotaFiscalBuilder;
import br.com.trilha.java.cursodp.notafiscal.NotaFiscalDao;

public class TestaAcao {
	public static void main(String[] args) {
		List<AcoesNotaFiscal> acoes = new ArrayList<>();
		acoes.add(new EnviadorDeEmail());
		acoes.add(new NotaFiscalDao());
		acoes.add(new EnviadorDeSms());
		acoes.add(new Impressora());
		acoes.add(new Multiplicador(4));

		NotaFiscalBuilder builder = new NotaFiscalBuilder(acoes);

		NotaFiscal notaFiscal = builder.paraEmpresa("Caelum").comCnpj("123.456.789/0001-10")
				.comItem(new ItemDaNota("item 1", 100.0)).comItem(new ItemDaNota("item 2", 200.0))
				.comItem(new ItemDaNota("item 3", 300.0)).comObservacoes("entregar notaFiscal pessoalmente").constroi();
	}

}
