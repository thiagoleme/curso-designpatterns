package br.com.trilha.java.cursodp;

public interface EstadoDoOrcamento {

	public void reprova(Orcamento orcamento);
	public void aprova(Orcamento orcamento);
	public void finaliza(Orcamento orcamento);
	public void aplicaDescontoExtra(Orcamento orcamento);
}
