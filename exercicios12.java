import java.util.Scanner;

public class exercicios12 {
public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int ValorA;
    int ValorB;

    System.out.println("Digite o valor A: ");
    ValorA = leitor.nextInt();

    System.out.println("Digite o valor B: ");
    ValorB = leitor.nextInt();

    System.out.println("o valor A é de " + ValorB + " e o valor B é de " + ValorA);
    leitor.close();
}
}