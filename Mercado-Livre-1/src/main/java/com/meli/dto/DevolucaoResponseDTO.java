package com.meli.dto;

import com.meli.model.ProdutoDevolucao;

public class DevolucaoResponseDTO {

	private ProdutoDevolucao produtoDevolucao;
	
	//Contructors
	
	public DevolucaoResponseDTO() {	}
	
	public DevolucaoResponseDTO(ProdutoDevolucao produtoDevolucao) {
		this.produtoDevolucao = produtoDevolucao;
	}

	//Get and Set
	
	public ProdutoDevolucao getProdutoDevolucao() {
		return produtoDevolucao;
	}

	public void setProdutoDevolucao(ProdutoDevolucao produtoDevolucao) {
		this.produtoDevolucao = produtoDevolucao;
	}

}
