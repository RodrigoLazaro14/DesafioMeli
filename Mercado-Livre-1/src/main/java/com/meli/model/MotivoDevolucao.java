package com.meli.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class MotivoDevolucao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMotivoDevolucao;
	
	@Column
	private String descricaoMotivoDevolucao;
	
	@Column
	private String siglaMotivoDevolucao;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<ProdutoDevolucao> produtoDevolucao;

	//Getters and Setters
	
	public Long getIdMotivoDevolucao() {
		return idMotivoDevolucao;
	}

	public void setIdMotivoDevolucao(Long idMotivoDevolucao) {
		this.idMotivoDevolucao = idMotivoDevolucao;
	}

	public String getDescricaoMotivoDevolucao() {
		return descricaoMotivoDevolucao;
	}

	public void setDescricaoMotivoDevolucao(String descricaoMotivoDevolucao) {
		this.descricaoMotivoDevolucao = descricaoMotivoDevolucao;
	}

	public String getSiglaMotivoDevolucao() {
		return siglaMotivoDevolucao;
	}

	public void setSiglaMotivoDevolucao(String siglaMotivoDevolucao) {
		this.siglaMotivoDevolucao = siglaMotivoDevolucao;
	}

	public List<ProdutoDevolucao> getProdutoDevolucao() {
		return produtoDevolucao;
	}

	public void setProdutoDevolucao(List<ProdutoDevolucao> produtoDevolucao) {
		this.produtoDevolucao = produtoDevolucao;
	}
	
	
}
