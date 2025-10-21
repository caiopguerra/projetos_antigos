package br.com.poo.contas;

public class Conta {
	
	private String agencia; //Integer/int 28851 ---- String 2885-1
	private String numConta;
	private String titular;
	private Double saldo = 0.0;
	private static Integer totalContas;

	public Conta() {
		Conta.totalContas++;
	}
	
	public Conta(Double valor) {
		depositar(valor);
	}
	
	public Conta(String titular) {
		this.titular = titular;
	}

	public Conta(String titular, String numConta) {
		//super(); //heranca
		this.titular = titular;
		this.numConta = numConta;
	}

	public void sacar(Double valor) {
		//operador ternario
		this.saldo = this.saldo < valor ? this.saldo : this.saldo - valor;
//		if(this.saldo < valor){
//			return false;
//		} else {
//			this.saldo -= valor;
//			return true;
//		}
	}
	
	public void depositar(Double valor) {
		if(this.saldo == null) {
			this.saldo = 0.0;
		} else {
			this.saldo += valor;			
		}
	}
	
	public void transferir(Double valor, Conta destino) {
		sacar(valor);
		destino.depositar(valor);
	}
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Double getSaldo() {
		return saldo;
	}
	
	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", numConta=" + numConta 
				+ ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	
}
