import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int valorA;
        int valorB;
        int valorC;
        

        System.out.println("digite o valor A");
        valorA = leitor.nextInt();

        System.out.println("digite o valor B");
        valorB = leitor.nextInt();

        System.out.println("digite o valor C");
        valorC = leitor.nextInt();

        int soma = valorA + valorB + valorC;
        int multiplicacao = valorA * valorB + valorC;

        if (valorA == valorB) {
            System.out.println(soma);
        }else{
            System.out.println(multiplicacao);
        }
        leitor.close();
    }
}
