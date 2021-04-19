package br.edu.insper.desagil.redesocial;

public class Produto {
	private String produto;
	private double preco;
	
	public Produto(String produto, double preco) {
		super();
		this.produto = produto;
		this.preco = preco;
	}

	public String getProduto() {
		return produto;
	}

	public double getPreco() {
		return preco;
	}

}
