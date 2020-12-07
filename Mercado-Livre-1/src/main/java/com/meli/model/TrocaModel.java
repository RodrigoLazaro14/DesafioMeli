package com.meli.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="tb_troca")
public class TrocaModel {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_troca", precision = 8, unique = true, nullable = false)
	private int idTroca;
	
	@Column(name="id_produto_devolucao")
	private long idProdutoDevolucao;
	
	
	@JoinColumn(name="id_produto_devolucao", unique = false, updatable = false, insertable = false)
	@ManyToOne
	private ProdutoDevolucao produtoDevolucao;


	public int getIdTroca() {
		return idTroca;
	}


	public void setIdTroca(int idTroca) {
		this.idTroca = idTroca;
	}


	public long getIdProdutoDevolucao() {
		return idProdutoDevolucao;
	}


	public void setIdProdutoDevolucao(long idProdutoDevolucao) {
		this.idProdutoDevolucao = idProdutoDevolucao;
	}


	public ProdutoDevolucao getProdutoDevolucao() {
		return produtoDevolucao;
	}


	public void setProdutoDevolucao(ProdutoDevolucao produtoDevolucao) {
		this.produtoDevolucao = produtoDevolucao;
	}
	
	
	
	
}
