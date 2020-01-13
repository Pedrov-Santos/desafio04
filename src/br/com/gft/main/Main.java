package br.com.gft.main;

import java.util.ArrayList;
import java.util.List;

import br.com.gft.model.*;

public class Main {
	public static void main(String[] args) {

		Livro l1 = new Livro("Harry potter", 40, 50, "J.K.Rolling", "fantasia", 300);
		Livro l2 = new Livro("Senhor dos Aneis", 60, 30, "J.R.R Tolkien", "fantasia", 500);
		Livro l3 = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);

		VideoGame game1 = new VideoGame("ps4", 1800, 100, "Sony", "Slim", false);
		VideoGame game2 = new VideoGame("ps4Usado", 1000, 7, "Sony", "Slim", true);
		VideoGame game3 = new VideoGame("XBOX", 1500, 500, "Microsoft", "One", false);

		List<Livro> livros = new ArrayList<>();
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);

		List<VideoGame> games = new ArrayList<>();
		games.add(game1);
		games.add(game2);
		games.add(game3);

		Loja americanas = new Loja("Americanas", "CNPJ 20.794.108-88", livros, games);
		
		l2.calcularImposto();
		l3.calcularImposto();
		
		game2.calcularImposto();
		game1.calcularImposto();
		
		americanas.listaLivros();
		americanas.listaVideoGame();
		americanas.calculaPatrimonio();
		
	}

}
