package br.com.fab.beans;

public class Calcado {
	
	private String tipo;
	private int tamanho;
	private double precoFabricacao;
	private String cor;
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public double getPrecoFabricacao() {
		return precoFabricacao;
	}
	public void setPrecoFabricacao(double precoFabricacao) {
		this.precoFabricacao = precoFabricacao;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

}
