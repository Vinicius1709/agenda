package br.com.agenda.teste;

import java.sql.SQLException;
import br.com.agenda.dao.UsuariolDAO;

public class LocalTeste {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		/*
		 * LocalDAO dao = new LocalDAO();
		 * 
		 * dao.inserir("Celesc");
		 */

		System.out.println("Lista Desatualizada");
		UsuariolDAO dao = new UsuariolDAO();
		System.out.println(dao.listarTudo());

		UsuariolDAO daoUpadate = new UsuariolDAO();
		daoUpadate.alterar("UniBox", 2L);

		System.out.println("Lista Atualizada");
		UsuariolDAO pesq = new UsuariolDAO();
		System.out.println(pesq.listarTudo());

		/*
		 * UsuariolDAO del = new UsuariolDAO(); del.excluir(1L);
		 */

	}
}
