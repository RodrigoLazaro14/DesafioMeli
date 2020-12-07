package com.meli.util;

import com.meli.model.Categoria;
import com.meli.model.MarcaModel;
import com.meli.model.MotivoDevolucao;
import com.meli.model.ProdutoDevolucao;

public class CodigoDevolucaoUtil {
	
	public ProdutoDevolucao produtoDevolucao = new ProdutoDevolucao();
//	private MarcaModel marca = new MarcaModel();
//	private Categoria categoria = new Categoria();
	private DataUtil data = new DataUtil();
//	private MotivoDevolucao motivoDevolucao = new MotivoDevolucao();
	
	/*
	private String codigoDevolucao = (
			categoria.getSiglaCategoria() +
			marca.getSiglaMarca() +
			motivoDevolucao.getSiglaMotivoDevolucao() +
			produtoDevolucao.getIdProdutoDevolucao() +
			data.dataFormatada
			);
	*/
	
	private String codigoDevolucao = (
			produtoDevolucao.getCategoria().getSiglaCategoria() +
			produtoDevolucao.getMarca().getSiglaMarca() +
			produtoDevolucao.getMotivo().getSiglaMotivoDevolucao() +
			produtoDevolucao.getIdProdutoDevolucao() +
			data.dataFormatada
			);

	public String teste(String codigo) {

		produtoDevolucao.setCodigoDevolucao(codigoDevolucao);
		
		codigo = produtoDevolucao.getCodigoDevolucao();
		
		return codigo;
	}
	
	//Constructors
	
	public CodigoDevolucaoUtil() {
	}	
	
	/*
	public CodigoDevolucaoUtil(MarcaModel marca, ProdutoDevolucao produtoDevolucao, Categoria categoria, DataUtil data,
			MotivoDevolucao motivoDevolucao, String codigoDevolucao) {
		super();
		this.marca = marca;
		this.produtoDevolucao = produtoDevolucao;
		this.categoria = categoria;
		this.data = data;
		this.motivoDevolucao = motivoDevolucao;
		this.codigoDevolucao = codigoDevolucao;
	}
	*/
	
	public CodigoDevolucaoUtil(ProdutoDevolucao produtoDevolucao, DataUtil data, String codigoDevolucao) {
		super();
		this.produtoDevolucao = produtoDevolucao;
		this.data = data;
		this.codigoDevolucao = codigoDevolucao;
	}
	
	//Getters and Setters

/*	
	public MarcaModel getMarca() {
		return marca;
	}	

	public void setMarca(MarcaModel marca) {
		this.marca = marca;
	}
*/
	public ProdutoDevolucao getProdutoDevolucao() {
		return produtoDevolucao;
	}

	public void setProdutoDevolucao(ProdutoDevolucao produtoDevolucao) {
		this.produtoDevolucao = produtoDevolucao;
	}
/*
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
*/
	public DataUtil getData() {
		return data;
	}

	public void setData(DataUtil data) {
		this.data = data;
	}
/*
	public MotivoDevolucao getMotivoDevolucao() {
		return motivoDevolucao;
	}

	public void setMotivoDevolucao(MotivoDevolucao motivoDevolucao) {
		this.motivoDevolucao = motivoDevolucao;
	}
*/
	public String getCodigoDevolucao() {
		return codigoDevolucao;
	}

	public void setCodigoDevolucao(String codigoDevolucao) {
		this.codigoDevolucao = codigoDevolucao;
	}

}
