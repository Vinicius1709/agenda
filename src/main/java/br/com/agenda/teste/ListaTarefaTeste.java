package br.com.agenda.teste;

import java.sql.SQLException;

import br.com.agenda.dao.ListaTarefaDAO;
import br.com.agenda.dao.LocalDAO;
import br.com.agenda.dao.UsuarioDAO;

public class ListaTarefaTeste {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// busca lista de lugares
		LocalDAO local = new LocalDAO();
		System.out.println(local.listarTudo());

		// busca lista de usuarios
		UsuarioDAO usuario = new UsuarioDAO();
		System.out.println(usuario.listarTudo());

		ListaTarefaDAO dao = new ListaTarefaDAO();
		dao.insert("Ir a barbearia", "Arrumar o cabelo e a barba", 3, 1);

	}
}
