package com.meli.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class ProdutoDevolucao {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProdutoDevolucao;
	
	@Column
	private String nomeProdutoDevolucao;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date = new java.sql.Date(System.currentTimeMillis());	
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JsonIgnoreProperties("produtoDevolucao")
	private Categoria categoria;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JsonIgnoreProperties("produtoDevolucao")
	private MarcaModel marca;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JsonIgnoreProperties("produtoDevolucao")
	private MotivoDevolucao motivo;

	@Column
	private String codigoDevolucao;
	
	//Getters and Setters
	
	public Long getIdProdutoDevolucao() {
		return idProdutoDevolucao;
	}

	public void setIdProdutoDevolucao(Long idProdutoDevolucao) {
		this.idProdutoDevolucao = idProdutoDevolucao;
	}

	public String getNomeProdutoDevolucao() {
		return nomeProdutoDevolucao;
	}

	public void setNomeProdutoDevolucao(String nomeProdutoDevolucao) {
		this.nomeProdutoDevolucao = nomeProdutoDevolucao;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public MarcaModel getMarca() {
		return marca;
	}

	public void setMarca(MarcaModel marca) {
		this.marca = marca;
	}

	public MotivoDevolucao getMotivo() {
		return motivo;
	}

	public void setMotivo(MotivoDevolucao motivo) {
		this.motivo = motivo;
	}

	public String getCodigoDevolucao() {
		return codigoDevolucao;
	}

	public void setCodigoDevolucao(String codigoDevolucao) {
		this.codigoDevolucao = codigoDevolucao;
	}

}
