package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.OcupacionesEntity;

@Repository

public interface OcupacionesRepository extends CrudRepository<OcupacionesEntity, Long>{

}
