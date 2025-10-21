package UdemyProjects;

import java.util.Scanner;

//FAÇA UM PROGRAMA QUE LEIA 5 VALORES (USANDO O FOR) E
//MOSTRE A SOMA DELES

// TODO refazer algoritmo -> Ok (preciso praticar mais o "for")
public class exercicio19 {

public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
	int j = 0;
	for(int i = 0; i <= 5; i++) {
		System.out.println("digite outro numero");
		j += leitor.nextInt();
	}
	System.out.println("o resultado final é " + j);
}
}
