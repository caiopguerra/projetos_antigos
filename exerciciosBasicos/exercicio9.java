import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        double peso;
        double altura;
        Scanner leitor = new Scanner(System.in);

        System.out.println("digite seu peso:");
        peso = leitor.nextDouble();

        System.out.println("digite sua altura: ");
        altura = leitor.nextDouble();

        double alturaAoQuadrado = altura * altura;

        double IMC = peso/ alturaAoQuadrado;

       if (IMC < 18.5) {
         System.out.println("Seu nível de IMC está abaixo do peso");
       }
       else if(IMC >= 18.6 || IMC < 24.9){
        System.out.println("Seu nível de IMC está ideal, Parabéns !");
       }
       else if(IMC >= 25.0 || IMC < 29.9){
        System.out.println("Seu nível de IMC está levemente acima do peso");
       }
       else if(IMC >= 30.0 || IMC < 34.9){
        System.out.println("Seu nível de IMC está em obesidade de 1 grau");
       }
       else if(IMC >= 35.0 || IMC < 39.9){
        System.out.println("Seu nível de IMC está em obesidade de 2 grau, está em nivel severo !");
       }
       else if(IMC > 40){
        System.out.println("CUIDADO !!!, OBESIDADE DE 3 GRAU !!!");
       }
        
        leitor.close();
    }
}
