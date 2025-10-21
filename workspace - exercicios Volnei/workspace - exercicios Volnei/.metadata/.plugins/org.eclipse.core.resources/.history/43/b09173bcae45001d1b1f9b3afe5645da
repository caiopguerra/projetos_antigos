package exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class TestaAgenda extends Agenda {

	public static void main(String[] args) throws ParseException {
		Scanner leitor = new Scanner(System.in);
		Agenda agenda = new Agenda();
		SimpleDateFormat sdf = new SimpleDateFormat("EEEEEEE, d, MMMMMM 'de' yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd,MM,yyyy");

		System.out.println("digite o nome do evento");
		agenda.setEvent(leitor.nextLine());

		System.out.println("digite uma data de inicio");
		agenda.setDateBegin(sdf2.parse(leitor.nextLine()));

		System.out.println("digite uma data de término");
		agenda.setDateEnd(sdf2.parse(leitor.nextLine()));

		String datainicio = sdf.format(agenda.getDateBegin());
		String datafim = sdf.format(agenda.getDateEnd());

		boolean confirmacao = queroadicionarPessoa(leitor);

		while (confirmacao) {
			System.out.println("essa pessoa é um Jogador ou um Programador ?");
		String resposta = leitor.next();

			if (resposta.equals("programador")) {
				agenda.adicionaPessoa(prepareProgramador(leitor));
			} else if (resposta.equals("jogador")) {
				agenda.adicionaPessoa(preparaJogador(leitor));
			}
			confirmacao = queroadicionarPessoa(leitor);
		}

		System.out.println(agenda.getEvent());
		System.out.println("Data de inicio: " + datainicio);
		System.out.println("Data de final:" + datafim);
		agenda.imprimeAgenda();
	}

	public static Boolean queroadicionarPessoa(Scanner leitor) {
		System.out.println("Voce quer adicionar alguma pessoa na agenda?");
		System.out.println("Sim ou Não:");
		String confirmacao = leitor.nextLine();
		return Objects.equals(confirmacao, "sim") || Objects.equals(confirmacao, "Sim");
	}

	public static Programador prepareProgramador(Scanner leitor) {

		Programador programador = new Programador();

		System.out.println("Digite o nome da pessoa");
		programador.setNome(leitor.next());

		System.out.println("Digite a idade da pessoa");
		programador.setIdade(leitor.nextInt());

		System.out.println("Digite a altura da pessoa");
		programador.setAltura(leitor.nextDouble());

		System.out.println("Digite o computador da pessoa");
		programador.setComputador(leitor.next());

		leitor.nextLine();

		System.out.println("digite o headset da pessoa");
		programador.setHeadset(leitor.next());

		System.out.println("Digite o teclado da pessoa");
		programador.setTeclado(leitor.next());

		leitor.nextLine();

		return programador;
	}

	public static Jogador preparaJogador(Scanner leitor) {

		Jogador jogador = new Jogador();

		System.out.println("Digite o nome da pessoa");
		jogador.setNome(leitor.next());

		System.out.println("Digite a idade da pessoa");
		jogador.setIdade(leitor.nextInt());

		System.out.println("Digite a altura da pessoa");
		jogador.setAltura(leitor.nextDouble());

		System.out.println("Digite a Chuteira da pessoa");
		jogador.setChuteira(leitor.next());

		leitor.nextLine();

		System.out.println("digite a Bola da pessoa");
		jogador.setBola(leitor.next());

		System.out.println("Digite o Meião da pessoa");
		jogador.setMeiao(leitor.next());

		leitor.nextLine();

		return jogador;
	}

}
