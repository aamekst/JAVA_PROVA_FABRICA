package br.com.fab.beans;

public class Chinelo extends Calcado  {
	
	private int quantidadeTira;

	public int getQuantidadeTira() {
		return quantidadeTira;
	}

	public void setQuantidadeTira(int quantidadeTira) {
		this.quantidadeTira = quantidadeTira;
	}

	
	public String mostrarAtributos()
	{
		return "Tipo: " + getTipo()+ "\n Tamanho: " + getTamanho() + "\n Preço:" + getPrecoFabricacao() + "\n cor:" + getCor() + "\n Tiras:" + getQuantidadeTira();
	}
	

}
