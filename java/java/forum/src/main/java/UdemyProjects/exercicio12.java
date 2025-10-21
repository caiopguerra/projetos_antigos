package UdemyProjects;
import java.util.Locale;
import java.util.Scanner;

//FAÇA UM PROGRAMA QUE LEIA 1 NÚMERO QUEBRADO E IMPRIMA
//NA TELA SE ELE FOR MENOR QUE 5 OU MAIOR QUE 10

// Duvida: Porque o código da erro quando eu ponho numero quebrado sendo que a variavel
// é um Double ????


public class exercicio12 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("digite um numero:");
		double numero = leitor.nextDouble();

		if(numero < 5 || numero > 10 ) {
			System.out.println("resposta valida");
		}
		else {System.out.println("resposta inválida");}
	}
}