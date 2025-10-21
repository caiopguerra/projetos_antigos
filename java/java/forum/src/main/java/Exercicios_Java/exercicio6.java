package Exercicios_Java;

import java.util.Scanner;

/*Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
antecessor e seu sucessor. -> OK*/

public class exercicio6 {
public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("digite um numero:");
	int numero = leitor.nextInt();
	int antecessor = numero - 1;
	int sucessor = numero + 1;
	
	System.out.println(numero);
	System.out.println("o antecessor é " + antecessor);
	System.out.println("o sucessor é " + sucessor);
}
}
