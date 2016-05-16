package br.com.caelum.jdbc.exception;

public class DaoException extends RuntimeException{

	public DaoException(String erro) {
		super(erro);
	}
	
}
