package br.com.agenda.dao;

import java.util.List;

import br.com.agenda.model.Local;

public interface DaoGenerica {

	void inserir(String nomeLocal);
	
	List<?> listarTudo();
	
	void excluir(Long id);
}
