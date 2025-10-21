package UdemyProjects;

import java.util.Scanner;

//FAÇA UM PROGRAMA QUE LEIA 3 VALORES E MOSTRE O
//RESULTADO DA SOMA DELES

// OK
public class exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int numero;
        numero = leitor.nextInt();

        System.out.println("digite outro numero: ");
        int outronumero;
        outronumero = leitor.nextInt();

        System.out.println("digite mais um numero: ");
        int maisumnumero;
        maisumnumero = leitor.nextInt();

        int resultado = numero + outronumero + maisumnumero;

        System.out.println(resultado);
    }
}
