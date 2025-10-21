import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class AddItemList01 {

    public static void main(String[] args) {

        // Classe que auxilia a leitura de dados inseridos no console
        Scanner input = new Scanner(System.in);

        // Variável que recebe do operador o número máximo e mínimo de times que serão inseridos na lista
        int tamanho_Lista = input.nextInt();

        // Lista de times
        List<String> numeros = new ArrayList<>();

        // Esse input é necessário para inserir dados no seguinte input. É uma especificidade do nextLine().
        input.nextLine();

        // a variável "i" inicia valendo 0. Verifique se ele é menor que "qttTeams".
        // Se sim, soma +1 no valor dela, e entra no escopo.
        // Se não, não soma nada e não entra no escopo do for
        for (int i = 0; i < tamanho_Lista; i++) {
            String numero = "Position " + i + ": " + input.nextLine();
            numeros.add("0");
            numeros.add("4");
            numeros.add("3");
            numeros.add("2");
            numeros.add("5");
            numeros.add("6");
        }

        // For para lançar no console os times da lista
        
        for(var i = 0; i < numeros.size(); i++){
        	
        
	}
 }
}
