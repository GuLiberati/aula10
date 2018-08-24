package br.com.db1.exercicio4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.db1.exercicio4.type.Sexo;

public class Pessoa {

	private String nome;
	private Date dataNascimento;
	private Sexo sexo;
	private List<Telefone> telefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<Telefone> getTelefone() {
		return telefone;
	}

	public void addTelefone(Telefone telefone){
		this.telefone.add(telefone);
	}
}
