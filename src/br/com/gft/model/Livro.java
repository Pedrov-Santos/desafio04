package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class Livro extends Produto implements Imposto {

	private String autor;
	private String tema;
	private int qntPag;

	public Livro(String nome, double preco, int qnt, String autor, String tema, int qntPag) {
		super(nome, preco, qnt);

		this.autor = autor;
		this.tema = tema;
		this.qntPag = qntPag;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQntPag() {
		return qntPag;
	}

	public void setQntPag(int qntPag) {
		this.qntPag = qntPag;
	}

	double imp = 0;

	public double calcularImposto() {
		if (this.tema == "educativo") {
			System.out.println("Livro educativo não possui impostos: " + this.getNome());
			return 0;
		} else {
			imp = this.getPreco() * 0.1;
			System.out.println("O imposto do livro, " + getNome() + " é de: R$" + imp);
			return imp;
		}
		

	}

}
