import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args){
        int valorA;
        int valorB;
        int valorC;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor A:");
        valorA = leitor.nextInt();
        System.out.println("Digite o valor B:");
        valorB = leitor.nextInt();
        System.out.println("Digite o valor C");
        valorC = leitor.nextInt();
        int soma = valorA + valorB;
        if(soma <= valorC){
            System.out.println("O valor somado de A e B é " + soma + " e é menor ou igual a C");
        }
        else{
            System.out.println("O valor somado de A e B é " + soma + " e é maior que C");
        }
        leitor.close();
    }
    
}


