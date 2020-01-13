package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto{

	private String marca;
	private String modelo;
	private boolean isUsado; 
	


	public VideoGame(String nome, double preco, int qnt, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qnt);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	
	public double calcularImposto() {
		double imp;
		if (this.isUsado == true) {
			imp = getPreco() * 0.25;
			System.out.println("Imposto: "+ this.getNome()+" " + getModelo() + " R$"+ imp);
			return imp;
			
		}else {
			imp= getPreco() * 0.45;
			System.out.println("Imposto: "+ this.getNome()+" " + getModelo() + " R$"+ imp);
			return imp;
		}
	}

}
