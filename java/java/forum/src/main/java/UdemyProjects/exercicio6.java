package UdemyProjects;

import java.util.Scanner;

//FAÇA UM PROGRAMA QUE LEIA 2 NÚMEROS INTEIROS E
//IMPRIMA NA TELA SE A SOMA ENTRE ELES FOR MAIOR QUE 10

public class exercicio6 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("digite um numero: ");
		int numero;
		numero = leitor.nextInt();
		
		System.out.println("digite outro numero: ");
		int outronumero;
		outronumero = leitor.nextInt();
		
		int resultado = numero + outronumero;

		if(resultado >= 10){
			System.out.println("o resultado " + resultado);
		}
		else {
			System.out.println("erro");
		}
	}

}
