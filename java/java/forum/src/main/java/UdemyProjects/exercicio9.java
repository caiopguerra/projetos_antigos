package UdemyProjects;
//FAÇA UM PROGRAMA QUE LEIA 1 PALAVRA E INFORME SE A
//PALAVRA FOR “DIA” OU NÃO
import java.util.Scanner;

public class exercicio9 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("digite uma palavra:");
		String palavra1;
		palavra1 = leitor.next();
        String palavra2;
        palavra2 = "dia";
		
		if(palavra1.equalsIgnoreCase(palavra2)){
			System.out.println("palavra correta");
		} 
		else{
			    System.out.println("palavra inválida");}
		}
}
