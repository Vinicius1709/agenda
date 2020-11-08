package br.com.agenda.teste;

import java.sql.SQLException;
import br.com.agenda.dao.LocalDAO;

public class LocalTeste {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		/*
		 * LocalDAO dao = new LocalDAO();
		 * 
		 * dao.inserir("Celesc");
		 */

		System.out.println("Lista Desatualizada");
		LocalDAO dao = new LocalDAO();
		System.out.println(dao.listarTudo());

		LocalDAO daoUpadate = new LocalDAO();
		daoUpadate.alterar("UniBox", 2L);

		System.out.println("Lista Atualizada");
		LocalDAO pesq = new LocalDAO();
		System.out.println(pesq.listarTudo());

		/*
		 * UsuariolDAO del = new UsuariolDAO(); del.excluir(1L);
		 */

	}
}
