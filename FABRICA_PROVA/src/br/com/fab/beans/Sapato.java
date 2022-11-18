package br.com.fab.beans;

public class Sapato extends Calcado{
	
	private double tamanhoSalto;


	public double getTamanhoSalto() {
		return tamanhoSalto;
	}


	public void setTamanhoSalto(double tamanhoSalto) {
		this.tamanhoSalto = tamanhoSalto;
	}



	public String mostrarAtributos()
	{
		return "Tipo: " + getTipo()+ "\n Tamanho: " + getTamanho() + "\n Preço:" + getPrecoFabricacao() + "\n cor:" + getCor() + "\n Tamhanho do salto:" + getTamanhoSalto();
	}
}
