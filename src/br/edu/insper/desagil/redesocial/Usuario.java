package br.edu.insper.desagil.redesocial;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nome;
	private List<Video> videos;
	
	public Usuario(String nome) {
		super();
		this.nome = nome;
		this.videos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}
	
	public Video postaVideo(int id, Produto produto) {
		Video video = new Video(id, this, produto);
		this.videos.add(video);
		return video;
	}
	
	public int totalAvaliacoes() {
		int medias = 0;
		for (Video video: this.videos) {
			medias += video.mediaAvaliacoes();
		}
		return medias;
	}
	
}
