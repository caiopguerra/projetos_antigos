import java.util.Arrays;
import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

       int[] valores = new int[3];
       for (int i = 0; i < 3; i++){
        System.out.print("Digite o " + (i + 1) + "º valor : ");
        valores[i] = leitor.nextInt();
       }

       Arrays.sort(valores);
       System.out.println("Valores em ordem decrescente:");
        for (int i = 2; i >= 0; i--) {
            System.out.println(valores[i]);
        }

        leitor.close();

    }
}
