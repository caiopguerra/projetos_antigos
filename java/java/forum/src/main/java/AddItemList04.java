import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddItemList04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		List<String>pneus = new ArrayList<>();
		
		int playlist = input.nextInt();
		input.nextLine();
		for(int i = 0; i <playlist; i++) {pneus.add(input.nextLine());}

		// Trabalhar com Lista
		// TODO Cada pneu deverá vir informado com a sua respectiva marca.
		// TODO A marca somente pode ser igual em até 3 pneus.
		// TODO Será necessário informar o mecânico que o trocou.
		// TODO exemplo: Marca: Michellin; Mecânico: Caio.
	}
	
}
