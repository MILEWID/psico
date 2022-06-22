package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.HorarioEntity;

@Repository


public interface HorarioRepository extends CrudRepository<HorarioEntity, Long>{

}
