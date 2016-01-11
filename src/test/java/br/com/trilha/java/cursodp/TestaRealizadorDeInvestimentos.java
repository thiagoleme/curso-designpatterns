package br.com.trilha.java.cursodp;

import br.com.trilha.java.cursodp.investimento.Arrojado;
import br.com.trilha.java.cursodp.investimento.Conservador;
import br.com.trilha.java.cursodp.investimento.Conta;
import br.com.trilha.java.cursodp.investimento.Investimento;
import br.com.trilha.java.cursodp.investimento.Moderado;
import br.com.trilha.java.cursodp.investimento.RealizadorDeInvestimentos;

public class TestaRealizadorDeInvestimentos {

	public static void main(String[] args) {
		RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();
		
		Conta conta = new Conta();
		conta.deposita(1000);
		
		Investimento arrojado = new Arrojado();
		realizadorDeInvestimentos.realiza(conta, arrojado);
		

		Investimento conservador = new Conservador();
		realizadorDeInvestimentos.realiza(conta, conservador);
		
		
		Investimento moderado = new Moderado();
		realizadorDeInvestimentos.realiza(conta, moderado);
	}
}
