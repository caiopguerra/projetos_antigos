package UdemyProjects;

import java.util.Scanner;

//FAÇA UM PROGRAMA QUE LEIA UM NÚMERO E IMPRIMA QUAL
//DIA DA SEMANA DE ACORDO COM O NÚMERO LIDO USANDO O
//VETOR:
//[Domingo,Segunda,Terça,Quarta,Quinta,Sexta,Sábado]

// Não entendi direito como os Vetores funcionam.

// TODO refazer algoritmo -> OK (praticar mais)
public class exercicio20 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String[] week = {"Domingo", "Segunda", "Terça", "Quarta",
        		"Quinta", "Sexta", "Sabado" };
        
        int numero_digitado = leitor.nextInt();
        
        if(numero_digitado <= 7 && numero_digitado >= 1) {
        	int n = numero_digitado - 1;
        	System.out.println(week[n]);
        } else {
        	System.out.println("numero digitado não é um dia da semana");
        }
}
}