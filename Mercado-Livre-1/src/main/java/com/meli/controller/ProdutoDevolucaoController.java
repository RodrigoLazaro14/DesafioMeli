package com.meli.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meli.model.ProdutoDevolucao;
import com.meli.repository.ProdutoDevolucaoRepository;
import com.meli.util.DataUtil;

@RestController
@RequestMapping("/devolucao")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdutoDevolucaoController {
	
	@Autowired
	private ProdutoDevolucaoRepository rep;
	
	@GetMapping()
	public ResponseEntity<List<ProdutoDevolucao>> getAll(){
		return ResponseEntity.ok(rep.findAll());
	}
	
	@PostMapping()
	public ResponseEntity<ProdutoDevolucao> post(@RequestBody ProdutoDevolucao devolucao){
		return ResponseEntity.status(HttpStatus.CREATED).body(rep.save(devolucao));
	}
		
	@PutMapping()
	public ResponseEntity<ProdutoDevolucao> put(@RequestBody ProdutoDevolucao devolucao){
		return ResponseEntity.status(HttpStatus.OK).body(rep.save(devolucao));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		rep.deleteById(id);
	}
	
}
