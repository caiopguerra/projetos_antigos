package Exercicios_Java;

import java.util.Scanner;

/*Crie um algoritmo que leia o valor do salário mínimo = R$-1.212 e o valor do salário de um usuário,
calcule a quantidade de salários mínimos que esse usuário ganha e imprima o resultado.
(1SM=R$788,00)*/

public class exercicio5 {
public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
	
	System.out.println("digite um valor de salario:");

	double salario_usuario = leitor.nextDouble();
	double salario_minimo = 1212;
	double somafinal = salario_usuario / salario_minimo;
	
	
		System.out.println(somafinal);
		
}
}