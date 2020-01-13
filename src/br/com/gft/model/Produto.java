package br.com.gft.model;

public abstract class Produto {
	
	private String nome;
	private double preco;
	private int qnt;
	
	public Produto(String nome, double preco, int qnt) {
		
		this.nome = nome;
		this.preco = preco;
		this.qnt= qnt;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	

}
