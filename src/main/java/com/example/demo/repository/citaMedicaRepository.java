package com.example.demo.repository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.CitaMedicaEntity;

@Repository

public interface citaMedicaRepository extends CrudRepository<CitaMedicaEntity, Long>{
	public abstract Optional<CitaMedicaEntity> findById(Long id);
}
