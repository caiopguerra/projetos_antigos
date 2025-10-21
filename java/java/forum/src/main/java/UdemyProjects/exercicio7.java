package UdemyProjects;

//FAÇA UM PROGRAMA QUE LEIA 1 NÚMERO INTEIRO E IMPRIMA
//NA TELA SE ELE FOR ÍMPAR

// Duvida: como fazer o pra Virtual Machine entender o que é par ou impar ???
import java.util.Scanner;

import org.h2.tools.Console;

// TODO usar % 2 para definir se o número é ímpar ou par
public class exercicio7 {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.println("digite um numero ");
		
		var numero = leitor.nextInt();
		numero = numero % 2;
		
		
		
		var impar = numero (1,3,5,7,9);
		
		if (numero == numero % 2) {
		   System.out.println("numero valido");
		} else {
		    System.out.println("numero invalido");
		}
		//System.out.println(impar);
		}

	private static void Console(String string) {
		// TODO Auto-generated method stub
		
	}

	private static boolean numero(int i, int j, int k, int l, int m) {
		// TODO Auto-generated method stub
		return null != null;
	}
}
