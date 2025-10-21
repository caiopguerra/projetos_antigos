package UdemyProjects;

import java.util.Scanner;

//FAÇA UM PROGRAMA QUE LEIA UM NOME E UM SOBRENOME
//E IMPRIMA NA TELA O NOME COMPLETO.
public class exercicio5 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("digite um nome :");
		String nome;
		nome = leitor.next();

		System.out.println("Digite um sobrenome: ");
		String sobrenome;
		sobrenome = leitor.next();

		System.out.println("nome completo: " + nome + " " + sobrenome);
	}
}
