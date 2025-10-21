import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        int nota1;
        int nota2;
        int nota3;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        nota1 = leitor.nextInt();

        System.out.println("Digite a segunda nota: ");
        nota2 = leitor.nextInt();

        System.out.println("Digite a terceira nota: ");
        nota3 = leitor.nextInt();

        int media = nota1 + nota2 + nota3 / 3;

        System.out.println("sua média final é: " + media);
        leitor.close();
    }
}
