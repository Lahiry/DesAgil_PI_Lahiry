package br.edu.insper.desagil.redesocial;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioTest {
//	private Usuario usuario1;
//	private Produto produto;
//	private Video video;
//	
//	@BeforeEach
//	public void SetUp() {
//		usuario1 = new Usuario("Lahiry");
//		produto = new Produto("Skate", 50);
//		video = new Video(1, usuario1, produto);
//	}

	@Test
	public void umVideoInvalidas() {
		Usuario usuario1 = new Usuario("Lahiry");
		Usuario usuario2 = new Usuario("Jonas");
		Usuario usuario3 = new Usuario("Leo");
		
		Produto produto = new Produto("Skate", 50);
		
		Video video = usuario1.postaVideo(1, produto);
		
		video.adicionaAvaliacao(usuario1, 5);
		video.adicionaAvaliacao(usuario2, 0);
		video.adicionaAvaliacao(usuario3, 6);
		
		assertEquals(0, usuario1.totalAvaliacoes());
	}
	
	@Test
	public void umVideoUmaAvaliacao() {
		Usuario usuario1 = new Usuario("Lahiry");
		Usuario usuario2 = new Usuario("Jonas");
		
		Produto produto = new Produto("Skate", 50);
		
		Video video = usuario1.postaVideo(1, produto);
		
		video.adicionaAvaliacao(usuario2, 5);
		
		assertEquals(5, usuario1.totalAvaliacoes());
	}
	
	@Test
	public void umVideoDuasAvaliacoes() {
		Usuario usuario1 = new Usuario("Lahiry");
		Usuario usuario2 = new Usuario("Jonas");
		Usuario usuario3 = new Usuario("Leo");
		
		Produto produto = new Produto("Skate", 50);
		
		Video video = usuario1.postaVideo(1, produto);
		
		video.adicionaAvaliacao(usuario2, 5);
		video.adicionaAvaliacao(usuario3, 3);
		
		assertEquals(4, usuario1.totalAvaliacoes());
	}
	
	@Test
	public void umVideoTresAvaliacoes() {
		Usuario usuario1 = new Usuario("Lahiry");
		Usuario usuario2 = new Usuario("Jonas");
		Usuario usuario3 = new Usuario("Leo");
		Usuario usuario4 = new Usuario("George");
		
		Produto produto = new Produto("Skate", 50);
		
		Video video = usuario1.postaVideo(1, produto);
		
		video.adicionaAvaliacao(usuario2, 3);
		video.adicionaAvaliacao(usuario3, 3);
		video.adicionaAvaliacao(usuario4, 1);
		
		assertEquals(2, usuario1.totalAvaliacoes());
	}
	
	@Test
	public void doisVideosTresValidas() {
		Usuario usuario1 = new Usuario("Lahiry");
		Usuario usuario2 = new Usuario("Jonas");
		Usuario usuario3 = new Usuario("Leo");
		Usuario usuario4 = new Usuario("George");
		
		Produto produto = new Produto("Skate", 50);
		
		Video video1 = usuario1.postaVideo(1, produto);
		Video video2 = usuario1.postaVideo(2, produto);
		
		video1.adicionaAvaliacao(usuario2, 3);
		video1.adicionaAvaliacao(usuario3, 3);
		video2.adicionaAvaliacao(usuario4, 1);
		
		assertEquals(4, usuario1.totalAvaliacoes());
	}
	
}
