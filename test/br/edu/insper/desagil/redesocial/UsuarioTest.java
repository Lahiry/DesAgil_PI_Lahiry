package br.edu.insper.desagil.redesocial;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioTest {
	private Usuario usuario;
	private Produto produto;
	private Video video;
	
	@BeforeEach
	public void SetUp() {
		usuario = new Usuario("Lahiry");
		produto = new Produto("Skate", 50);
		video = usuario.postaVideo(1, produto);
	}

	@Test
	public void umVideoInvalidas() {
		Usuario usuario2 = new Usuario("Jonas");
		Usuario usuario3 = new Usuario("Leo");
		
		video.adicionaAvaliacao(usuario, 5);
		video.adicionaAvaliacao(usuario2, 0);
		video.adicionaAvaliacao(usuario3, 6);
		
		assertEquals(0, usuario.totalAvaliacoes());
	}
	
	@Test
	public void umVideoUmaAvaliacao() {
		Usuario usuario2 = new Usuario("Jonas");
		
		video.adicionaAvaliacao(usuario2, 5);
		
		assertEquals(5, usuario.totalAvaliacoes());
	}
	
	@Test
	public void umVideoDuasAvaliacoes() {
		Usuario usuario2 = new Usuario("Jonas");
		Usuario usuario3 = new Usuario("Leo");
		
		video.adicionaAvaliacao(usuario2, 5);
		video.adicionaAvaliacao(usuario3, 3);
		
		assertEquals(4, usuario.totalAvaliacoes());
	}
	
	@Test
	public void umVideoTresAvaliacoes() {
		Usuario usuario2 = new Usuario("Jonas");
		Usuario usuario3 = new Usuario("Leo");
		Usuario usuario4 = new Usuario("George");
		
		video.adicionaAvaliacao(usuario2, 3);
		video.adicionaAvaliacao(usuario3, 3);
		video.adicionaAvaliacao(usuario4, 1);
		
		assertEquals(2, usuario.totalAvaliacoes());
	}
	
	@Test
	public void doisVideosTresValidas() {
		Usuario usuario2 = new Usuario("Jonas");
		Usuario usuario3 = new Usuario("Leo");
		Usuario usuario4 = new Usuario("George");
		
		Video video2 = usuario.postaVideo(2, produto);
		
		video.adicionaAvaliacao(usuario2, 3);
		video.adicionaAvaliacao(usuario3, 3);
		video2.adicionaAvaliacao(usuario4, 1);
		
		assertEquals(4, usuario.totalAvaliacoes());
	}
	
}
