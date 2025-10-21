import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/* Array 01: Fazer algoritmo que receba um número para definir o tamanho da lista.
 * Através do tamanho da lista, será necessário criar um for para adicionar em cada casa uma nova entrada.
 * A entrada poderá ser texto, número... 
 */


// algoritimo que cria novas listas
public class AddItemList03 {
	private static int i;

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
    List<String>times = new ArrayList<>();
    
		
		int tamanho_lista = input.nextInt();
		input.nextLine();
	    for(int i = 0; i <tamanho_lista; i++) {times.add(input.nextLine());}
	    
	    times.add("Flamengo");
	    times.add("Vasco");
	    times.add("Botafogo");
	    times.add("Fluminense");
	    
	    
	    i = 0;
	    Iterator<String> iterator = times.iterator();
	    while (iterator.hasNext()) {
	      System.out.println(iterator.next());
	      i++;

		// TODO Cada time deverá vir com uma posição informada, exemplo: Posição: 1° - Flamengo
		// TODO Após lançar os times da lista, deverá ser oportunizado ao usuário reiniar a aplicação. Dica: WHILE
	}
	}
}
