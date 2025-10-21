import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        double valor;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor");
        valor = leitor.nextDouble();

        double reajuste = valor/5;

        System.out.println("O valor com o reajuste é de: " + reajuste);
        leitor.close();
    }
}
