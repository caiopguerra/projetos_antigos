package UdemyProjects;

//FAÇA UM PROGRAMA QUE LEIA 1 NÚMERO QUEBRADO E IMPRIMA
//NA TELA SE ELE ESTIVER ENTRE 5 E 20

//Duvida: porque não consigo usar && para Int ou boolean ???
import java.util.Scanner;

public class exercicio10 {
public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	System.out.println("Insira um numero");
	double numero = leitor.nextDouble();

	if(numero >= 5 && numero <= 20) { // TODO corrigir condicional do IF -> Ok
System.out.println("o resultado é " + numero);
} else {
	System.out.println("erro");
}
}
}
