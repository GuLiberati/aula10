package br.com.db1.exercicio8;

public class PessoaJuridica {

	private Integer cnpj;

	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}

	public Boolean validarCnpj() {
		return true;
	}

	public String formatarCnpj() {
		return "CNPJ";
	}
}
