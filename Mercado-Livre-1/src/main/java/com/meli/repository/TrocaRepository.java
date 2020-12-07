package com.meli.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meli.model.TrocaModel;

@Repository
public interface TrocaRepository extends CrudRepository<TrocaModel, Long> {

}

