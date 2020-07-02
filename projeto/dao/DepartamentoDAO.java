package br.com.rosacorp.projeto.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.rosacorp.projeto.model.Departamento;



public interface DepartamentoDAO extends CrudRepository<Departamento, Integer>{

}