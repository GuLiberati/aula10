package br.com.db1.exercicio8;

import java.util.Date;

public class Banco {

	private String nome;
	private Date dataFundacao;
	private String publico;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public String getPublico() {
		return publico;
	}

	public void setPublico(String publico) {
		this.publico = publico;
	}

	public Boolean isPublico() {
		return true;
	}

}
