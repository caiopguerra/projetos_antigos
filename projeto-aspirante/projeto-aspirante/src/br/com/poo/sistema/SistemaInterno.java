package br.com.poo.sistema;

import br.com.poo.contas.Conta;
import br.com.poo.contas.ContaCorrente;
import br.com.poo.contas.ContaPoupanca;

public class SistemaInterno {

	public static void main(String[] args) {
		//visualizando o atributo static
		Conta bia = new Conta();
		Conta matheus = new Conta();
		Conta max = new Conta();
		Conta isa = new Conta();
		
		//visualizando a heranca
		ContaCorrente maria = new ContaCorrente();
		ContaCorrente cassio = new ContaCorrente();
		ContaPoupanca jon = new ContaPoupanca();
		ContaPoupanca james = new ContaPoupanca();
		james.getRendimento();
		james.depositar(10.0);
		
		//instancia, atualizacao de variaveis, chamada de métodos
		Conta ana = new Conta(10.0);
		ana.setAgencia("123");
		ana.setNumConta("456");
		ana.setTitular("Ana");
		ana.depositar(10.0);
		Conta caio = new Conta("Caio", "789");
		caio.depositar(10.0);
		
		ana.getSaldo();
		caio.getSaldo();
		
		ana.depositar(50.0);
		caio.depositar(10.0);
		
		System.out.println("Ana: " + ana.getSaldo());
		System.out.println("Caio: " + caio.getSaldo());
		
		ana.transferir(50.0, caio);
		
		System.out.println("Ana Depois: " + ana.getSaldo());
		System.out.println("Caio Depois: " + caio.getSaldo());
	}

}
