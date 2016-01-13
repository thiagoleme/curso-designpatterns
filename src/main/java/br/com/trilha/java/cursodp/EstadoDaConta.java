package br.com.trilha.java.cursodp;

public interface EstadoDaConta {
	void saca(Conta conta, double valor);

	void deposita(Conta conta, double valor);
}
