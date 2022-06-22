package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.MedicoHorarioEntity;

@Repository
public interface MedicoHorarioRepository extends CrudRepository<MedicoHorarioEntity, Long> {

}
