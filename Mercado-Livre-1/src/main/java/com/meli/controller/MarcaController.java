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

import com.meli.model.MarcaModel;
import com.meli.repository.MarcaRepository;

@RestController
@RequestMapping("/marca")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MarcaController {
	
	@Autowired
	private MarcaRepository rep;
	
	@GetMapping()
	public ResponseEntity<List<MarcaModel>> getAll(){
		return ResponseEntity.ok(rep.findAll());
	}
	
	@PostMapping()
	public ResponseEntity<MarcaModel> post(@RequestBody MarcaModel marca){
		return ResponseEntity.status(HttpStatus.CREATED).body(rep.save(marca));
	}
	
	@PutMapping()
	public ResponseEntity<MarcaModel> put(@RequestBody MarcaModel marca){
		return ResponseEntity.status(HttpStatus.OK).body(rep.save(marca));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		rep.deleteById(id);
	}

}
