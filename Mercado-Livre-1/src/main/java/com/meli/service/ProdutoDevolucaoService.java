package com.meli.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meli.model.Desistencia;
import com.meli.model.ProdutoDevolucao;
import com.meli.repository.ProdutoDevolucaoCrudRepository;

@RestController
@Service
public class ProdutoDevolucaoService {
	
	
	@Autowired
	private ProdutoDevolucaoCrudRepository produtoDevolucaoCrudRepository;
	

	public ProdutoDevolucao produtoDevolucao = new ProdutoDevolucao();
	public Desistencia desistencia = new Desistencia();
	
	/*
	@PostMapping
	public DevolucaoResponseDTO efetuarDevolucao(CodigoDevolucaoUtil devolucao) {

		ProdutoDevolucao produtoDevolucao = new ProdutoDevolucao();
		
		produtoDevolucao.setCodigoDevolucao(devolucao.getCodigoDevolucao());

		produtoDevolucao  =	this.produtoDevolucaoCrudRepository.save(produtoDevolucao);
		
		return new DevolucaoResponseDTO(produtoDevolucao);
	}
	*/

	@PostMapping
	public Object separarProdutos() {
		
		if(produtoDevolucao.getCategoria().getSiglaCategoria() == "EL") {
			
			if(produtoDevolucao.getMarca().getSiglaMarca() == "SA") {

				if(produtoDevolucao.getMotivo().getSiglaMotivoDevolucao() == "DE") {
					
//					produtoDevolucao.setCodigoDevolucao(testeDevolucao.getCodigoDevolucao());
					
					desistencia.setIdDesistencia(produtoDevolucao.getIdProdutoDevolucao());
					desistencia.setNomeProdutoDesistencia(produtoDevolucao.getNomeProdutoDevolucao());
					desistencia.setCategoria(produtoDevolucao.getCategoria());
					desistencia.setMarca(produtoDevolucao.getMarca());
//					desistencia.setCodigoDevolucao(testeDevolucao.getCodigoDevolucao());				
						
				} /*else if(motivoDevolucao.getSiglaMotivoDevolucaoModel() == "IN" && testeDevolucao.getCodigoDevolucao().toLowerCase().contains(motivoDevolucao.getSiglaMotivoDevolucaoModel().toLowerCase())) {
				
					produtoDevolucao.setCodigoDevolucao(testeDevolucao.getCodigoDevolucao());

					insucesso.setIdProdutoInsucesso(produtoDevolucao.getIdProdutoDevolucao());
					insucesso.setNomeProdutoInsucesso(produtoDevolucao.getNomeProdutoDevolucao());
					insucesso.setCategoria(produtoDevolucao.getCategoria());
					insucesso.setMarca(produtoDevolucao.getMarca());
					insucesso.setCodigoDevolucaoInsucesso(testeDevolucao.getCodigoDevolucao());
					
				}*/
				
			}/*else {
				System.out.println("ABREVIAÇÃO: " + marca.getAbreviacaoMarca());
				System.out.println("Não funcionou!");
			}*/	
		}/*else {
			System.out.println("ABREVIAÇÃO CATEGORIA NÃO FUNCIONOU!");
		}*/

		return "";
	}
	
}
