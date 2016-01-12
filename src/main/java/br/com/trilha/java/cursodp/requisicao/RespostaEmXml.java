package br.com.trilha.java.cursodp.requisicao;

import br.com.trilha.java.cursodp.Conta;

public class RespostaEmXml implements Resposta {
	private Resposta outraResposta;

	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.XML) {
			System.out.println("<conta><titular>" + conta.getTitular() + "</titular><saldo>" + conta.getSaldo()
					+ "</saldo></conta>");
		} else {
			outraResposta.responde(req, conta);
		}
	}

	public void setProxima(Resposta resposta) {
		this.outraResposta = resposta;
	}
}