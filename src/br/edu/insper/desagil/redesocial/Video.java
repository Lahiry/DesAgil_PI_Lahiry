package br.edu.insper.desagil.redesocial;

import java.util.HashMap;
import java.util.Map;

public class Video {
	int id;
	Usuario usuario;
	Produto produto;
	Map<String, Integer> avaliacoes;
	
	public Video(int id, Usuario usuario, Produto produto) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.produto = produto;
		this.avaliacoes = new HashMap<>();
	}

	public int getId() {
		return id;
	}

	public Produto getProduto() {
		return produto;
	}
	
	public void adicionaAvaliacao(Usuario usuario, int avaliacao) {
		if ((usuario.getNome() != this.usuario.getNome()) && (avaliacao >= 1 && avaliacao <= 5 )) {
			this.avaliacoes.put(usuario.getNome(), avaliacao);
		}
	}
	
	public int mediaAvaliacoes() {
		int total = 0;
		int qtd = this.avaliacoes.size();
		for (int avaliacao: this.avaliacoes.values()) {
			total += avaliacao;
		}
		double media = Math.round((double) total/qtd);
		return (int) media;
	}
	
}
