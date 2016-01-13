package br.com.trilha.java.cursodp;

public class Aprovado implements EstadoDoOrcamento {
	private boolean descontoAplicado = false;

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento está em estado de aprovação e não pode ser reprovado");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já está em estado de aprovação");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoDoOrcamento = new Finalizado();
	}

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if (!descontoAplicado) {
			orcamento.valor -= orcamento.valor * 0.02;
			descontoAplicado = true;
		} else {
			throw new RuntimeException("Desconto já aplicado!");
		}
	}

}
