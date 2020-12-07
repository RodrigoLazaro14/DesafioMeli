package com.meli.util;

import java.text.SimpleDateFormat;

import com.meli.model.ProdutoDevolucao;

public class DataUtil {

	ProdutoDevolucao produtoDevolucao = new ProdutoDevolucao();
	
	SimpleDateFormat formatoData = new SimpleDateFormat("ddMMyyyyHHmmss");
	public String dataFormatada = formatoData.format(produtoDevolucao.getDate());
	
}
