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

import com.meli.model.Desistencia;
import com.meli.repository.DesistenciaRepository;

@RestController
@RequestMapping("/desistencia")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DesistenciaController {
	
	@Autowired
	private DesistenciaRepository rep;
	
	@GetMapping()
	public ResponseEntity<List<Desistencia>> getAll(){
		return ResponseEntity.ok(rep.findAll());
	}
	
	@PostMapping()
	public ResponseEntity<Desistencia> post(@RequestBody Desistencia desistencia){
		return ResponseEntity.status(HttpStatus.CREATED).body(rep.save(desistencia));
	}
	
	@PutMapping()
	public ResponseEntity<Desistencia> put(@RequestBody Desistencia desistencia){
		return ResponseEntity.status(HttpStatus.OK).body(rep.save(desistencia));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		rep.deleteById(id);
	}


}
