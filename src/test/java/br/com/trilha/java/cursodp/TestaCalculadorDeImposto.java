package br.com.trilha.java.cursodp;

import br.com.trilha.java.cursodp.imposto.CalculadorDeImposto;
import br.com.trilha.java.cursodp.imposto.ICCC;
import br.com.trilha.java.cursodp.imposto.ICMS;
import br.com.trilha.java.cursodp.imposto.ISS;
import br.com.trilha.java.cursodp.imposto.Imposto;
import br.com.trilha.java.cursodp.imposto.Orcamento;

public class TestaCalculadorDeImposto {
	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto iccc = new ICCC();

		Orcamento orcamento = new Orcamento(10000.0);

		CalculadorDeImposto calculador = new CalculadorDeImposto();

		// Calculando o ISS
		calculador.realizaCalculo(orcamento, iss);

		// Calculando o ICMS
		calculador.realizaCalculo(orcamento, icms);
		
		// Calculando o ICCC
		calculador.realizaCalculo(orcamento, iccc);
	}
}
