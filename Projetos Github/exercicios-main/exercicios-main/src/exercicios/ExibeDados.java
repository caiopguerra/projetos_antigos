package exercicios;

public class ExibeDados {
	public static void main(String[] args) {

		Pessoa Caio = new Pessoa();
		Caio.setNome("Caio");
		Caio.setDia(13);
		Caio.setMes(07);
		Caio.setAno(2005);
		Caio.setAltura(1.76);
		
		int idade = 2022 % Caio.getAno();

		System.out.println(Caio.getNome());

		System.out.println(Caio.getDia() + "-" + Caio.getMes() + "-" +
				Caio.getAno());

		System.out.println("altura - " + Caio.getAltura());

		System.out.println(idade + " anos");
	}
}
