package Exercicios_Java;

import java.util.Scanner;

//Informar um saldo e imprimir o saldo com reajuste de 1%. -> OK

public class exercicio3 {
public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("Digite um saldo");
	
	double saldo = leitor.nextDouble();
	double reajuste = saldo * 0.01;
	double saldo_final = saldo + reajuste;
	
	System.out.println("O reajuste final é:" + saldo_final);
}
}
