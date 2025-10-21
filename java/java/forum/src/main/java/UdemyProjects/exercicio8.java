package UdemyProjects;

//FAÇA UM PROGRAMA QUE LEIA UMA PALAVRA E INFORME SE
//ELA TEM PELO MENOS 5 LETRAS OU SE TEM MENOS 
//(PESQUISE SOBRE O COMANDO .LENGTH) 
import java.util.Scanner;

public class exercicio8 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("digite uma palavra");
		String palavra;
		palavra = leitor.next();

		if(palavra.length() <= 5 ) {
			System.out.println("palavra válida");
		}
		else {
			System.out.println("palavra inválida");
		}
	}
}
