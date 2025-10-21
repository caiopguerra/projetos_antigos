package Exercicios_Java;

import java.util.Arrays;
import java.util.Scanner;

import org.hibernate.mapping.Array;

/*4. Escrever um algoritmo que lê:
- a porcentagem do IPI = 25% a ser acrescido no valor das peças
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.

Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)*/

public class exercicio4 {
public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
	
	int[][] matriz = {{30,90},{1154,2213}};
	//System.out.println(matriz[0]);
	
   
    
	int valor_peca1 = matriz[0][0];
	int valor_peca2 = matriz[0][1];
	
		
		System.out.println("código da peça 1: " + matriz[1][0]);

	
	System.out.println("insira a quantidade de peças");
	int quant_pecas = leitor.nextInt();
	
	
	for(int i = 0; i > 10; i++) {
      }      if(quant_pecas > 1) {
    	  valor_peca1 = valor_peca1 * quant_pecas ;
	}
       for(int i = 0; i < 90; i++) {
    	for(int j = 0; j < 2213; j++) {
    		//System.out.println(matriz[i][j]);
    	}
    }
	 	
	System.out.println("código da peça 2: " + matriz[1][1]);

	
	System.out.println("insira a quantidade de peças");
	int quant_pecas2 = leitor.nextInt();
   
   for(int j = 0; j > 10; j++) {
      if(quant_pecas2 > 1) {
 	  valor_peca2 = valor_peca2* quant_pecas;}
   }
   
   int soma_valores = valor_peca1 + valor_peca2;
      
      System.out.println("o valor final das peças é igual a: R$ " + soma_valores);
}
}