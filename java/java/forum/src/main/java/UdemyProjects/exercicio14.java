package UdemyProjects;

//FAÇA UM PROGRAMA QUE LEIA UM NÚMERO E IMPRIMA QUAL
//DIA DA SEMANA DE ACORDO COM O NÚMERO LIDO USANDO
//SWITCH -> OK
//(1-Domingo,2-Segunda,3-Terça,4-Quarta,
//5-Quinta,6-Sexta,7-Sábado)

// Duvida: Porque o meu Switch n funciona como deveria ??

import java.util.Scanner;
// TODO Consertar o switch case
public class exercicio14 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("1 - Domingo");
		System.out.println("2 - Segunda");
		System.out.println("3 - Terça");
		System.out.println("4 - Quarta");
		System.out.println("5 - Quinta");
		System.out.println("6 - Sexta");
		System.out.println("7 - Sabado");

		System.out.println();
		System.out.println("Insira um dia da semana:");

		int dia = leitor.nextInt();

		switch (dia)
		{
		case 1: {
			System.out.println("Domingo");
			break;
		}

		case 2: {
			System.out.println("Segunda");
			break;
		}

		case 3: {
			System.out.println("Terça");
			break;
		}

		case 4: {
			System.out.println("Quarta");
			break;
		}

		case 5:
			System.out.println("Quinta");

			Case:
				System.out.println("Sexta");

			Case:
				System.out.println("Sabádo");
		}
	}
}
