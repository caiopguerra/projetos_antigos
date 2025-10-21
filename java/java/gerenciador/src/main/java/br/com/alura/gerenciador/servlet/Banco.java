package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	public static List<Empresa> lista = new ArrayList<Empresa>();
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Ferrari");
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Mercedes");
		
		lista.add(empresa);
		lista.add(empresa2);
	}

	public List<Empresa> getEmpresas(){
		
		return Banco.lista;
	}

	public void adiciona(Empresa empresa) {
		lista.add(empresa);
		
	}

	
}
