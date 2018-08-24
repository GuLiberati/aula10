package br.com.db1.exercicio7;

public class Olimpiada {

	private Integer ano;
	private Sede sede;
	private Pessoa pessoa;
	private Modalidade modalidade;

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Olimpiada(Pessoa pessoaParametro, Sede sedeParametro,
			Modalidade modalidadeParametro) {
		this.pessoa = pessoaParametro;
		this.sede = sedeParametro;
		this.modalidade = modalidadeParametro;
	}

}
