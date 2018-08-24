package br.com.db1.exercicio8;

public class PessoaFisica {

	private Integer cpf;

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Boolean validarCpf() {
		return true;
	}

	public String formatarCpf() {
		return "CPF";
	}
}
