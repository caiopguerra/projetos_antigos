import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean valor1;
        boolean valor2;

        System.out.println("O valor 1 é verdadeiro ou falso ?");
        valor1 = leitor.hasNext();

        System.out.println("O valor 2 é verdadeiro ou falso ?");
        valor2 = leitor.hasNext();

        if (valor1 == true && valor2 == true) {
            System.out.println("os 2 valores são verdadeiros");
        }
        else if (valor1 == true && valor2 == false) {
            System.out.println("o valor 1 é verdadeiro e o valor 2 é falso");
        }
        else if (valor1 == false && valor2 == true) {
            System.out.println("o valor 1 é falso e o valor 2 é verdadeiro");
        }
        else if (valor1 == false && valor2 == false) {
            System.out.println("os 2 valores são falsos");
        }
        leitor.close();
    }
}
