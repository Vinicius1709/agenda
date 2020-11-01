package br.com.agenda.data;

import java.sql.Connection;
import java.sql.SQLException;

public class ConexaoMySql implements Conexao{

	@Override
	public Connection getConnection() {
		return null;
	}

	@Override
	public void close() {
	}

	@Override
	public void commit() throws SQLException {		
	}

	@Override
	public void rollback() {		
	}

}
