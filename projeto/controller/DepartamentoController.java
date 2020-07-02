package br.com.rosacorp.projeto.controller;
	
	import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.rosacorp.projeto.dao.DepartamentoDAO;
import br.com.rosacorp.projeto.model.Departamento;


@RestController
@CrossOrigin("*") 
public class DepartamentoController {

	@Autowired
	DepartamentoDAO dao;
	
	@GetMapping("/departamentos")
	public ArrayList<Departamento> listarTodos(){
		ArrayList<Departamento> lista = (ArrayList<Departamento>)dao.findAll();
		return lista;
	}
	
	
	@GetMapping("/departamentos/{id}")
	public ResponseEntity<Departamento> buscarPeloId(@PathVariable int id){
		Departamento depto = dao.findById(id).orElse(null);
		if (depto != null) {
			return ResponseEntity.ok(depto);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
}