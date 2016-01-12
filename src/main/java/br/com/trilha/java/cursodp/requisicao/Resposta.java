package br.com.trilha.java.cursodp.requisicao;

import br.com.trilha.java.cursodp.Conta;

public interface Resposta {
	void responde(Requisicao req, Conta conta);

	void setProxima(Resposta resposta);
}
