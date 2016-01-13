package br.com.trilha.java.cursodp;

import java.util.Calendar;

public class Conta {
	private String titular;
	protected double saldo;
	private int numero;
	private int agencia;
	private Calendar dataAbertura;
	protected EstadoDaConta estado;

	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
		dataAbertura = Calendar.getInstance();
	}

	public Conta() {
		dataAbertura = Calendar.getInstance();
	}

	public void deposita(double valor) {
		estado.deposita(this, valor);
	}

	public void saca(double valor) {
		estado.saca(this, valor);
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

}
