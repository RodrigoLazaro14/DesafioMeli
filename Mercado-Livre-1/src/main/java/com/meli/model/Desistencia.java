package com.meli.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Desistencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDesistencia;
	
	@Column
	private String nomeProdutoDesistencia;
		
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JsonIgnoreProperties("produtoDevolucao")
	private Categoria categoria;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JsonIgnoreProperties("produtoDevolucao")
	private MarcaModel marca;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JsonIgnoreProperties("produtoDevolucao")
	private MotivoDevolucao motivo;

	public Long getIdDesistencia() {
		return idDesistencia;
	}

	public void setIdDesistencia(Long idDesistencia) {
		this.idDesistencia = idDesistencia;
	}

	public String getNomeProdutoDesistencia() {
		return nomeProdutoDesistencia;
	}

	public void setNomeProdutoDesistencia(String nomeProdutoDesistencia) {
		this.nomeProdutoDesistencia = nomeProdutoDesistencia;
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

	

}
