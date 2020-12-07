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

import com.meli.model.MotivoDevolucao;
import com.meli.repository.MotivoDevolucaoRepository;

@RestController
@RequestMapping("/motivo")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MotivoDevolucaoController {

	@Autowired
	private MotivoDevolucaoRepository rep;
	
	@GetMapping()
	public ResponseEntity<List<MotivoDevolucao>> getAll(){
		return ResponseEntity.ok(rep.findAll());
	}
	
	@PostMapping()
	public ResponseEntity<MotivoDevolucao> post(@RequestBody MotivoDevolucao motivo){
		return ResponseEntity.status(HttpStatus.CREATED).body(rep.save(motivo));
	}
	
	@PutMapping()
	public ResponseEntity<MotivoDevolucao> put(@RequestBody MotivoDevolucao motivo){
		return ResponseEntity.status(HttpStatus.OK).body(rep.save(motivo));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		rep.deleteById(id);
	}

	
}
