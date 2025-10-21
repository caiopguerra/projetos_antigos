import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        int numero;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero");
        numero = leitor.nextInt();

        int Antecessor = numero - 1;
        int Sucessor = numero + 1;

        System.out.println("numero digitado: " + numero);
        System.out.println("Antecessor: " + Antecessor);
        System.out.println("Sucessor: " + Sucessor);

        leitor.close();
    }
}
