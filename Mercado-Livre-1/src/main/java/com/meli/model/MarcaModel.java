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
public class MarcaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMarca;
	
	@Column
	private String nomeMarca;
	
	@Column
	private String siglaMarca;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<ProdutoDevolucao> produtoDevolucao;
	
	//Getters and Setters
	
	public Long getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(Long idMarca) {
		this.idMarca = idMarca;
	}
	public String getNomeMarca() {
		return nomeMarca;
	}
	public void setNomeMarca(String nomeMarca) {
		this.nomeMarca = nomeMarca;
	}
	public String getSiglaMarca() {
		return siglaMarca;
	}
	public void setSiglaMarca(String siglaMarca) {
		this.siglaMarca = siglaMarca;
	}
	public List<ProdutoDevolucao> getProdutoDevolucao() {
		return produtoDevolucao;
	}
	public void setProdutoDevolucao(List<ProdutoDevolucao> produtoDevolucao) {
		this.produtoDevolucao = produtoDevolucao;
	}
	
	
	

}
