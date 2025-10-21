package UdemyProjects;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("digite um numero:");
		int numero = leitor.nextInt();
		System.out.println("digite outro numero:");
		int outronumero = leitor.nextInt();
		
		if(numero > 10 || outronumero > 10 ) {
			System.out.println("resposta valida");
		}
		else {System.out.println("resposta inválida");}
}
}