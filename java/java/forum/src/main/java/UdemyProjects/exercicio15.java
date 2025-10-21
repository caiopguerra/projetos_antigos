package UdemyProjects;

import java.util.Scanner;

//FAÇA UM PROGRAMA QUE IMPRIMA NA TELA A SOMA DOS 10
//PRIMEIROS NÚMEROS NATURAIS.

// TODO refazer algoritmo -> OK (praticar mais)
public class exercicio15 {
    public static void main(String[] args) {
    	Scanner leitor = new Scanner(System.in);
    	int soma = 0;
    	
    	for(int i = 0; i < 10; i++ ) {
    		int n = leitor.nextInt();
    		if(n >= 0) {
    			soma = n + soma;
    		}
    	}
    	
    	System.out.println(soma);
}
}
