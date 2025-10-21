package exercicios;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

public class Agenda {

	private String event;
	private Date dateBegin;
	private Date dateEnd;
	private List<Pessoa> pessoas;

	public List<Pessoa> getPessoas() {
		return this.pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public Agenda() {

	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public Date getDateBegin() {
		return dateBegin;
	}

	public void setDateBegin(Date d) {
		this.dateBegin = d;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	void imprimeAgenda() {
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		listaPessoas = this.getPessoas();
		for (Pessoa pessoaAtual : listaPessoas) {
				System.out.println(pessoaAtual.getNome() + " " + pessoaAtual.getIdade() + " " + pessoaAtual.getAltura());
			}
		}

	public void adicionaPessoa(Pessoa pessoa) {
		// não preciso do if, nem da linha 67 pois faço tudo isso na 63 (ternário)
		List<Pessoa> novaLista = (this.pessoas == null)? new ArrayList<Pessoa>():this.pessoas;
		if (this.pessoas == null) {
			this.pessoas = new ArrayList<Pessoa>();
		}
		novaLista = this.pessoas;
		novaLista.add(pessoa);
		setPessoas(novaLista);
		
	}
	
	
	void removePessoa(String nome) {
		List<Pessoa> novaLista = (this.pessoas == null)? new ArrayList<Pessoa>():this.pessoas;
		for (Pessoa pessoaAtual : novaLista) {
			if (pessoaAtual.getNome().equals(nome)) {
				novaLista.remove(pessoaAtual);
			}
		}
	}

	void imprimePessoa(int idade) {
		List<Pessoa> novaLista = (this.pessoas == null)? new ArrayList<Pessoa>():this.pessoas;;
		for(int i = 0; i < novaLista.size(); i++) {
			pessoas.get(i);
			System.out.println(novaLista.get(i));
		}
	}

	void buscaPessoa(String nome) {
		List<Pessoa> novaLista = (this.pessoas == null)? new ArrayList<Pessoa>():this.pessoas;;
		pessoas = getPessoas();
		for (Pessoa pessoaAtual : novaLista) {
			if (pessoaAtual.getNome().equals(nome)) {
				System.out.println(pessoaAtual);
			}
		} 
	}

	@Override
	public String toString() {
		return "Agenda [pessoas=" + pessoas + ", getPessoas()=" + getPessoas() + "]";
	}


}