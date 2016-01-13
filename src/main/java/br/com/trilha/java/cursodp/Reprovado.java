package br.com.trilha.java.cursodp;

public class Reprovado implements EstadoDoOrcamento {

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Já estou reprovado!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento está em estado de reprovação, não pode aprovar agora!");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoDoOrcamento = new Finalizado();
	}

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
	}

}
