package br.com.trilha.java.cursodp;

import br.com.trilha.java.cursodp.imposto.CalculadorDeImposto;
import br.com.trilha.java.cursodp.imposto.ICCC;
import br.com.trilha.java.cursodp.imposto.ICPP;
import br.com.trilha.java.cursodp.imposto.IKCV;
import br.com.trilha.java.cursodp.imposto.Imposto;
import br.com.trilha.java.cursodp.imposto.ImpostoMuitoAlto;

public class TestaCalculadorDeImposto {
	public static void main(String[] args) {
		// Imposto iss = new ISS();
		// Imposto icms = new ICMS();
		Imposto iccc = new ICCC();
		Imposto icpp = new ICPP(iccc);
		Imposto ikcv = new IKCV(icpp);
		Imposto impostoMuitoAlto = new ImpostoMuitoAlto(ikcv);

		Orcamento orcamento = new Orcamento(10000.0);
		Item item = new Item("Faca", 150);
		orcamento.adicionaItem(item);

		CalculadorDeImposto calculador = new CalculadorDeImposto();

		// Calculando o ISS
		// calculador.realizaCalculo(orcamento, iss);

		// Calculando o ICMS
		// calculador.realizaCalculo(orcamento, icms);

		// Calculando o ICCC
		// calculador.realizaCalculo(orcamento, iccc);

		// Calculando o ICPP
		// calculador.realizaCalculo(orcamento, icpp);

		// Calculando o IKCV
		calculador.realizaCalculo(orcamento, ikcv);

		// Calculando o ImpostoMuitoAlto
		calculador.realizaCalculo(orcamento, impostoMuitoAlto);
	}
}
