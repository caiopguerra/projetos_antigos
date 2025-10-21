package UdemyProjects;

//FAÇA UM PROGRAMA QUE LEIA 2 NÚMEROS INTEIROS
//E IMPRIMA NA TELA SE OS 2 SÃO MAIORES QUE 10 OU SE
//PELO MENOS UM NÃO É MAIOR QUE 10 

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean continueContando = true;

        while (continueContando) {
            System.out.println("digite um numero:");
            int numero = leitor.nextInt();

            emaiorQueDez(numero);

            System.out.println("Quer digitar mais um numero?");
            continueContando = leitor.nextBoolean();
        }

    }

    public static void emaiorQueDez(int n) {
        if (n > 10) {
            System.out.println("resposta valida");
        } else {
            System.out.println("resposta inválida");
        }
    }

}