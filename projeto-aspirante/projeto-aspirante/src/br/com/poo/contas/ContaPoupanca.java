package br.com.poo.contas;

public class ContaPoupanca extends Conta {

	private Double rendimento;
	
	public Double getRendimento() {
		return rendimento;
	}
	public void setRendimento(Double rendimento) {
		this.rendimento = rendimento;
	}
	
	@Override
	public String toString() {
		return "ContaPoupanca [rendimento=" + rendimento + "]";
	}
	
}
