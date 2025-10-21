import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        int numero;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número");
        numero = leitor.nextInt();

        if (numero == 0 || numero == 2 || numero == 4 || numero == 6 || numero == 8 || numero == 10) {
            System.out.println("o numero em questão é positivo e par");
        }
        else if (numero == 1 || numero == 3 || numero == 5 || numero == 7 || numero == 9) {
            System.out.println("o numero em questão é positivo e impar");
        }
        else if (numero == -2 || numero == -4 || numero == -6 || numero == -8 || numero == -10) {
            System.out.println("o numero em questão é negativo e par");
        }
        else if (numero == -1 || numero == -3 || numero == -5 || numero == -7 || numero == -9) {
            System.out.println("o numero em questão é negativo e impar");
        }
        else{
            System.out.println("numero inválido");
        }
        leitor.close();
    }
}
