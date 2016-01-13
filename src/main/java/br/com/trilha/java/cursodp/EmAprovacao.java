package br.com.trilha.java.cursodp;

public class EmAprovacao implements EstadoDoOrcamento {
	private boolean descontoAplicado = false;

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoDoOrcamento = new Reprovado();
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoDoOrcamento = new Aprovado();
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orcamento em aprovação não podem ir para finalizado diretamente");
	}

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if (!descontoAplicado) {
			orcamento.valor -= orcamento.valor * 0.05;
			descontoAplicado = true;
		} else {
			throw new RuntimeException("Desconto já aplicado!");
		}
	}

}
