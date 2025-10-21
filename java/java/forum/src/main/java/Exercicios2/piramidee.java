package Exercicios2;

import java.util.Scanner;

public class piramidee {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int base = leitor.nextInt();

		for(int i = 0; i <= base; i++) {
			for(int j = i; j < base; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++) {
				System.out.print(" *");
			}
		System.out.println();
		} 
	}
}	
