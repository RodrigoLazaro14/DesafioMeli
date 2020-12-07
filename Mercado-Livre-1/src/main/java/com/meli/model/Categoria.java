package com.meli.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Categoria implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String descricao;
	
	private String siglaCategoria;

	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<ProdutoDevolucao> produtoDevolucao;
	
	//Constructors
	
	public Categoria() {
	}

	public Categoria(Long id, String descricao, String siglaCategoria, List<Produto> produto,
			List<ProdutoDevolucao> produtoDevolucao) {
		this.id = id;
		this.descricao = descricao;
		this.siglaCategoria = siglaCategoria;
		this.produto = produto;
		this.produtoDevolucao = produtoDevolucao;
	}

	//Getters and Setters
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSiglaCategoria() {
		return siglaCategoria;
	}

	public void setSiglaCategoria(String siglaCategoria) {
		this.siglaCategoria = siglaCategoria;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	public List<ProdutoDevolucao> getProdutoDevolucao() {
		return produtoDevolucao;
	}

	public void setProdutoDevolucao(List<ProdutoDevolucao> produtoDevolucao) {
		this.produtoDevolucao = produtoDevolucao;
	}
	
}
