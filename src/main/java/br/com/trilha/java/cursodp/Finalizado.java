package br.com.trilha.java.cursodp;

public class Finalizado implements EstadoDoOrcamento {

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("N�o posso mudar mais, j� estou finalizado!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("N�o posso mudar mais, j� estou finalizado!");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("N�o posso mudar mais, j� estou finalizado!");
	}

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
	}

}
