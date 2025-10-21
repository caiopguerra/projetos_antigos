import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddItemList02 {

    public static void main(String[] args) {
        // Método sendo chamado
        changeTheRoads();
    }
    public static void changeTheRoads() {

        // Classe que auxilia a leitura de dados inseridos no console
        Scanner input = new Scanner(System.in);

        // Variável que recebe do operador o número máximo e mínimo de pneus que serao alterados
        int qttPneus = input.nextInt();

        // Lista de pneus
        List<String> pneus = new ArrayList<>();

        // a variável "i" inicia valendo 0. Verifique se ele é menor que "qttPneus".
        // Se sim, soma +1 no valor dela, e entra no escopo.
        // Se não, não soma nada e não entra no escopo do for
        for (int i = 0; i < qttPneus; i++) {
            pneus.add(input.nextLine());
        }

        for (String pneu : pneus) {
            System.out.println(pneu);
        }
    }
}
	