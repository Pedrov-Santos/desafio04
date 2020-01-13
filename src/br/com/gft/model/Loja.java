package br.com.gft.model;

import java.util.List;

public class Loja {

	private String nome;
	private String cnpj;
	private List<Livro> livros;
	private List<VideoGame> videoGame;

	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGame) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGame = videoGame;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpg() {
		return cnpj;
	}

	public void setCnpg(String cnpg) {
		this.cnpj = cnpg;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGame() {
		return videoGame;
	}

	public void setVideoGame(List<VideoGame> videoGame) {
		this.videoGame = videoGame;
	}

	public void listaLivros() {
		System.out.println("-----------------------------------------------------------------");
		System.out.println("A loja americanas possui estes livros para venda:");
		for (Livro livro : livros) {
			System.out.println("Titulo: " + livro.getNome() + ", Preço: " + livro.getPreco() + ", Quantidade: "
					+ livro.getQnt() + " em estoque");
		}
	}

	public void listaVideoGame() {
		System.out.println("-----------------------------------------------------------------");
		System.out.println("A loja americanas possui estes video-game para venda:");

		for (VideoGame games : videoGame) {
			System.out.println("Video-game: " + games.getNome() + ", preço: " + games.getPreco() + ", Quantidade: "
					+ games.getQnt() + " em estoque");
		}

	}

	public void calculaPatrimonio() {
		System.out.println("-----------------------------------------------------------------");
		int estoq = 0;
		if (getLivros().size() == 0) {
			return;
		} else {
			for (Livro livro : livros) {
				estoq += livro.getQnt() * livro.getPreco();
			}
		}
		if(getVideoGame().size()==0) {
			return;
		}else {
			for (VideoGame games : videoGame) {
				estoq += games.getQnt() * games.getPreco();
			}
		}
		System.out.println("O patrimonio da loja americanas é de: "+ estoq);
	}

}
