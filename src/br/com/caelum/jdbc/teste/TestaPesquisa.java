package br.com.caelum.jdbc.teste;

import java.text.SimpleDateFormat;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaPesquisa {

	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		Contato contato = dao.pesquisar(1);
		
		if(contato != null) {
		    System.out.println("Nome: " + contato.getNome());
		    System.out.println("Email: " + contato.getEmail());
		    System.out.println("Endereco: " + contato.getEndereco());
		    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		    System.out.println("Data de Nascimento: " + date.format(contato.getDataNascimento().getTime()));
		} else {
			System.out.println("Não encontrado no banco de dados.");
		}
	}
	
}
