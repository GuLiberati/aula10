package br.com.db1.exercicio3.inface;

public class CalculadoraComInterface {

	private Double resultado;
	private Double primeiroValor;
	private Double segundoValor;
	private OperacaoMatematica operacao;

	public CalculadoraComInterface(Double valor1, Double valor2) {
		this.primeiroValor = valor1;
		this.segundoValor = valor2;
	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}

	public Double getPrimeiroValor() {
		return primeiroValor;
	}

	public void setPrimeiroValor(Double primeiroValor) {
		this.primeiroValor = primeiroValor;
	}

	public Double getSegundoValor() {
		return segundoValor;
	}

	public void setSegundoValor(Double segundoValor) {
		this.segundoValor = segundoValor;
	}

	public void zerarCalculo() {
		resultado = 0d;
	}

	public Double somar(Double valor1, Double valor2) {
		return valor1 + valor2;
	}

	public Double subtrair(Double valor1, Double valor2) {
		return valor1 - valor2;
	}

	public Double dividir(Double valor1, Double valor2) {
		return valor1 / valor2;
	}

	public Double multiplicar(Double valor1, Double valor2) {
		return valor1 * valor2;
	}

	public Double exibirResultado() {
		return resultado;
	}

}
