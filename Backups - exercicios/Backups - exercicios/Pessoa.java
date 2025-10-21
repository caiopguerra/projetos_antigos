package exercicios;

import java.util.Collection;

public class Pessoa {

	protected String nome;
	protected int dia;
	protected int mes;
	protected int ano;
	protected Integer idade;
	
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	protected double altura;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

	public String toString() {
		return "nome: " + this.nome + " dia: " + this.dia + ", mes:" + this.mes +
				", ano " + this.ano +"altura:" + this.altura + ",idade: " + idade;
	}
}
