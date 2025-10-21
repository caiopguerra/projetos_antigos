import java.util.Scanner;

public class exercicios11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        int idade;

        System.out.println("Digite seu nome: ");
        nome = leitor.next();

        System.out.println("digite sua idade: ");
        idade = leitor.nextInt();

        if (idade >= 18) {
            System.out.println("Seu nome é " + nome + " e vc é maior de idade");
        }else{
            System.out.println("Seu nome é " + nome + " e vc é menor de idade"); 
        }
        leitor.close();
    }
}
