package Exercicios_Java;

import java.util.Scanner;

/*Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias  -> OK*/

public class exercicio2 {
public static void main(String[] args) {
	
	int nota1 = 8;
	int nota2 = 9;
	int nota3 = 7;
	
	int media1 = (nota1 + nota2 + nota3) / 3;
	
	int nota4 = 4;
	int nota5 = 5;
	int nota6 = 6;
	
	int media2 = (nota4 + nota5 + nota6) / 3;
	
	int soma_de_medias = media1 + media2;
	
	double media_final = soma_de_medias / 2;
	
	
	System.out.println("a média de 8, 9 e 7 é: " + media1);
	
	System.out.println("a média de 4, 5 e 6 é: " + media2);
	
	System.out.println("a soma das médias é igual a: " + soma_de_medias);
	
	System.out.println("a média final é: " + media_final);
}
}
