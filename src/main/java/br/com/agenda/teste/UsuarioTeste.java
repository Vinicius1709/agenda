package br.com.agenda.teste;

import java.sql.SQLException;

import br.com.agenda.dao.LocalDAO;
import br.com.agenda.dao.UsuarioDAO;

public class UsuarioTeste {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		/*
		 * UsuarioDAO dao = new UsuarioDAO();
		 * 
		 * dao.inserir("Vinicius");
		 */

		System.out.println("Lista Desatualizada");
		UsuarioDAO dao = new UsuarioDAO();
		System.out.println(dao.listarTudo());

		UsuarioDAO daoUpadate = new UsuarioDAO();
		daoUpadate.alterar("Alicio", 2L);

		System.out.println("Lista Atualizada");
		UsuarioDAO pesq = new UsuarioDAO();
		System.out.println(pesq.listarTudo());

		UsuarioDAO del = new UsuarioDAO();
		del.excluir(4L);

	}

}
