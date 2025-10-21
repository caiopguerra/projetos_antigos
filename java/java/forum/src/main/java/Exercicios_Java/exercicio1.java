package Exercicios_Java;

import java.util.Scanner;

import org.hibernate.internal.build.AllowSysOut;

/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias
e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.) -> OK*/

public class exercicio1 {
public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("digite sua idade");
     int idade = leitor.nextInt();
     int dias = idade % 365;
     int mes = idade % 12;
     int ano = idade;
     
     int dias_contados = idade * 365;
     
     System.out.println(ano + " anos, " + mes + " meses " + dias + " dias.");
     System.out.println(dias_contados +" dias de vida");
}
}
